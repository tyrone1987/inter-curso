<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Editing Atleta</title>
            <link rel="stylesheet" type="text/css" href="/proyecto-web-ui/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Editing Atleta</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Nombre:"/>
                    <h:inputText id="nombre" value="#{atleta.atleta.nombre}" title="Nombre" />
                    <h:outputText value="Edad:"/>
                    <h:inputText id="edad" value="#{atleta.atleta.edad}" title="Edad" />
                    <h:outputText value="Peso:"/>
                    <h:inputText id="peso" value="#{atleta.atleta.peso}" title="Peso" />
                    <h:outputText value="Id:"/>
                    <h:outputText value="#{atleta.atleta.id}" title="Id" />

                </h:panelGrid>
                <br />
                <h:commandLink action="#{atleta.edit}" value="Save">
                    <f:param name="jsfcrud.currentAtleta" value="#{jsfcrud_class['ec.com.internacional.proyecto.web.ui.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][atleta.atleta][atleta.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{atleta.detailSetup}" value="Show" immediate="true">
                    <f:param name="jsfcrud.currentAtleta" value="#{jsfcrud_class['ec.com.internacional.proyecto.web.ui.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][atleta.atleta][atleta.converter].jsfcrud_invoke}"/>
                </h:commandLink>
                <br />
                <h:commandLink action="#{atleta.listSetup}" value="Show All Atleta Items" immediate="true"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />

            </h:form>
        </body>
    </html>
</f:view>
