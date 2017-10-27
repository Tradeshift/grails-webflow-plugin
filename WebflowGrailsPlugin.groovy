import org.codehaus.groovy.grails.webflow.WebFlowPluginSupport

class WebflowGrailsPlugin {
    def version = "2.1.1-ts0"
    def observe = ['controllers']
    def dependsOn = [controllers:"2.4 > *"]
    def loadAfter = ['contollers','hibernate','hibernate4']
    def grailsVersion = "2.4 > *"
    def author = "Graeme Rocher"
    def authorEmail = "grocher@gopivotal.com"
    def title = "Spring Web Flow Plugin"
    def description = 'Integrates Spring Web Flow with Grails'
    def documentation = "http://grails-plugins.github.io/grails-webflow-plugin/"

    def license = "APACHE"
    def organization = [name: 'Pivotal', url: 'http://www.gopivotal.com/oss/']
    def issueManagement = [system: 'JIRA', url: 'http://jira.grails.org/browse/GPWEBFLOW']
    def scm = [url: 'https://github.com/grails-plugins/grails-webflow-plugin']

    def doWithSpring = WebFlowPluginSupport.doWithSpring
    def doWithDynamicMethods = WebFlowPluginSupport.doWithDynamicMethods
    def doWithApplicationContext = WebFlowPluginSupport.doWithApplicationContext
    def onChange = WebFlowPluginSupport.onChange
}
