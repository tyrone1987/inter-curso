<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Atleta</title>
            <link rel="stylesheet" type="text/css" href="/proyecto-web-ui/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Atleta</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{atleta.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Nombre:"/>
                    <h:inputText id="nombre" value="#{atleta.atleta.nombre}" title="Nombre" />
                    <h:outputText value="Edad:"/>
                    <h:inputText id="edad" value="#{atleta.atleta.edad}" title="Edad" />
                    <h:outputText value="Peso:"/>
                    <h:inputText id="peso" value="#{atleta.atleta.peso}" title="Peso" />

                </h:panelGrid>
                <br />
                <h:commandLink action="#{atleta.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{atleta.listSetup}" value="Show All Atleta Items" immediate="true"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />

            </h:form>
        </body>
    </html>
</f:view>
