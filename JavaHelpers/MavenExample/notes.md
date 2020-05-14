## **Maven**

[Maven Tutorial](https://howtodoinjava.com/maven/) 

[Maven Naming Conventions](http://maven.apache.org/guides/mini/guide-naming-conventions.html)

    Maven is a build and dependency management tool for Java application development.

#### **Maven Dependencies**

    "pom.xml" contains dependencies of a project.

    The <dependencies> tag pair cover all dependencies of the project, while each dependency is described with a few attributes and is enclosed by a pair of <dependency> tag.

    <groupId> identifies project across all projects, follows Java's package naming rules.

    <artifactId> is the name of the jar without version number.

    <version> is the version number for the artifact.

    <scope> limits transitivity of a dependency, there are 6 scopes in total. They are - compile, provided, runtime, system, test, import.
    
#### **Maven Dependencies - Scope**

    "compile" is the default maven scope. Dependencies with compile scope are needed to build, test and run the project.

    "provided" scope is used during build and test of the project. These dependencies should never be exported.

    "runtime" scope means that the jars are not needed at the time of build, but are part of the classpath to test and run the project.

    "test" scope are not needed to build and run the project.

    "system" scope is similar to provided, only that system scope dependencies are not retrieved from remote repositories.

    "import" scope is supported on a dependency type pom in the dependencyManagement section.

#### **POM (Project Object Model)**

    POM (Project Object Model) is an XML file that contains information about the project and configuration details used by Maven to build the project

    must be placed at the root of the project.


#### ** Miscellaneous **

    1. "archetype" is a projet structure in maven.