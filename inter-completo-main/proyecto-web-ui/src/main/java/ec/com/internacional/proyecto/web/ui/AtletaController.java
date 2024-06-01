/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.proyecto.web.ui;

import ec.com.internacional.proyecto.ejb.Atleta;
import ec.com.internacional.proyecto.ejb.daos.AtletaFacadeLocal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.FacesException;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;
import ec.com.internacional.proyecto.web.ui.util.JsfUtil;
import ec.com.internacional.proyecto.web.ui.util.PagingInfo;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Tyrone
 */
public class AtletaController {

    @PersistenceUnit(unitName = "deportesPU")
    private EntityManagerFactory emf = null;

    @Resource
    private UserTransaction utx = null;

    @EJB
    private AtletaFacadeLocal jpaController;

    public AtletaController() {
        pagingInfo = new PagingInfo();
        converter = new AtletaConverter();
    }

    private Atleta atleta = null;
    private List<Atleta> atletaItems = null;
    private AtletaConverter converter = null;
    private PagingInfo pagingInfo = null;

    public PagingInfo getPagingInfo() {
        if (pagingInfo.getItemCount() == -1) {
            pagingInfo.setItemCount(jpaController.count());
        }
        return pagingInfo;
    }

    public SelectItem[] getAtletaItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(jpaController.findAll(), false);
    }

    public SelectItem[] getAtletaItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(jpaController.findAll(), true);
    }

    public Atleta getAtleta() {
        if (atleta == null) {
            atleta = (Atleta) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentAtleta", converter, null);
        }
        if (atleta == null) {
            atleta = new Atleta();
        }
        return atleta;
    }

    public String listSetup() {
        reset(true);
        return "atleta_list";
    }

    public String createSetup() {
        reset(false);
        atleta = new Atleta();
        return "atleta_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            jpaController.create(atleta);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Atleta was successfully created.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return listSetup();
    }

    public String detailSetup() {
        return scalarSetup("atleta_detail");
    }

    public String editSetup() {
        return scalarSetup("atleta_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        atleta = (Atleta) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentAtleta", converter, null);
        if (atleta == null) {
            String requestAtletaString = JsfUtil.getRequestParameter("jsfcrud.currentAtleta");
            JsfUtil.addErrorMessage("The atleta with id " + requestAtletaString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String atletaString = converter.getAsString(FacesContext.getCurrentInstance(), null, atleta);
        String currentAtletaString = JsfUtil.getRequestParameter("jsfcrud.currentAtleta");
        if (atletaString == null || atletaString.length() == 0 || !atletaString.equals(currentAtletaString)) {
            String outcome = editSetup();
            if ("atleta_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit atleta. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            jpaController.edit(atleta);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Atleta was successfully updated.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return detailSetup();
    }

    public String remove() {
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentAtleta");
        Long id = new Long(idAsString);
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            jpaController.remove(jpaController.find(id));
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Atleta was successfully deleted.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return relatedOrListOutcome();
    }

    private String relatedOrListOutcome() {
        String relatedControllerOutcome = relatedControllerOutcome();
        if (relatedControllerOutcome != null) {
            return relatedControllerOutcome;
        }
        return listSetup();
    }

    public List<Atleta> getAtletaItems() {
        if (atletaItems == null) {
            getPagingInfo();
            atletaItems = jpaController.findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return atletaItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "atleta_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "atleta_list";
    }

    private String relatedControllerOutcome() {
        String relatedControllerString = JsfUtil.getRequestParameter("jsfcrud.relatedController");
        String relatedControllerTypeString = JsfUtil.getRequestParameter("jsfcrud.relatedControllerType");
        if (relatedControllerString != null && relatedControllerTypeString != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            Object relatedController = context.getApplication().getELResolver().getValue(context.getELContext(), null, relatedControllerString);
            try {
                Class<?> relatedControllerType = Class.forName(relatedControllerTypeString);
                Method detailSetupMethod = relatedControllerType.getMethod("detailSetup");
                return (String) detailSetupMethod.invoke(relatedController);
            } catch (ClassNotFoundException e) {
                throw new FacesException(e);
            } catch (NoSuchMethodException e) {
                throw new FacesException(e);
            } catch (IllegalAccessException e) {
                throw new FacesException(e);
            } catch (InvocationTargetException e) {
                throw new FacesException(e);
            }
        }
        return null;
    }

    private void reset(boolean resetFirstItem) {
        atleta = null;
        atletaItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Atleta newAtleta = new Atleta();
        String newAtletaString = converter.getAsString(FacesContext.getCurrentInstance(), null, newAtleta);
        String atletaString = converter.getAsString(FacesContext.getCurrentInstance(), null, atleta);
        if (!newAtletaString.equals(atletaString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }

}
