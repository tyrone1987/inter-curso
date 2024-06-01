<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Atleta Items</title>
            <link rel="stylesheet" type="text/css" href="/proyecto-web-ui/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Atleta Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Atleta Items Found)<br />" rendered="#{atleta.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{atleta.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{atleta.pagingInfo.firstItem + 1}..#{atleta.pagingInfo.lastItem} of #{atleta.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{atleta.prev}" value="Previous #{atleta.pagingInfo.batchSize}" rendered="#{atleta.pagingInfo.firstItem >= atleta.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{atleta.next}" value="Next #{atleta.pagingInfo.batchSize}" rendered="#{atleta.pagingInfo.lastItem + atleta.pagingInfo.batchSize <= atleta.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{atleta.next}" value="Remaining #{atleta.pagingInfo.itemCount - atleta.pagingInfo.lastItem}"
                                   rendered="#{atleta.pagingInfo.lastItem < atleta.pagingInfo.itemCount && atleta.pagingInfo.lastItem + atleta.pagingInfo.batchSize > atleta.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{atleta.atletaItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Nombre"/>
                            </f:facet>
                            <h:outputText value="#{item.nombre}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Edad"/>
                            </f:facet>
                            <h:outputText value="#{item.edad}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Peso"/>
                            </f:facet>
                            <h:outputText value="#{item.peso}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Id"/>
                            </f:facet>
                            <h:outputText value="#{item.id}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{atleta.detailSetup}">
                                <f:param name="jsfcrud.currentAtleta" value="#{jsfcrud_class['ec.com.internacional.proyecto.web.ui.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][atleta.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{atleta.editSetup}">
                                <f:param name="jsfcrud.currentAtleta" value="#{jsfcrud_class['ec.com.internacional.proyecto.web.ui.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][atleta.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{atleta.remove}">
                                <f:param name="jsfcrud.currentAtleta" value="#{jsfcrud_class['ec.com.internacional.proyecto.web.ui.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][atleta.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>
                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{atleta.createSetup}" value="New Atleta"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />
            </h:form>
        </body>
    </html>
</f:view>
