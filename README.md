

This template was created to give you an ability to make multiplatform projects using Intellij IDEa as IDE and Processing as the main library for graphic output and user interaction and Gradle for management.

Project contains 3 modules:
app - android module with activity initialization and launcher class.
desktop - desktop module with launcher class.
core - main code

WHAT YOU SHOULD DO BEFORE START TO CREATE YOUR PROCESSING APPLICATION/GAME:

1) Open local.properties
2) Find line: sdk.dir
3) Change the path to your Android SDK folder
4) Rebuild the project

WHAT SHOULD YOU DO TO LAUNCH THE DESKTOP VERSION:

1) Find the configuration panel (right from a green hammer)
2) Open list of all the configurations
3) Select "Edit configuration"
4) Press "+"
5) Select "Application"
6) Fill the field 
Name: - Desktop launcher
JDK or JRE - select your JDK (Java development kit). The version must be 1.8 or more
Select the module whose classpath should be used to run... - -cp Processing_multiplatform_project_template.desktop.main
The fully qualified name of the class that contains the main method.. - io.itch.mgdsstudio.processingproject.desktop.DesktopLauncher
7) Mark: Store as project file
8) Click - Apply
9) Click - OK

Now you can select this configuration and press the green triangle to launch this.

WHAT SHOULD YOU DO TO LAUNCH THE ANDROID VERSION:

1) Find the configuration panel (right from a green hammer)
2) Open list of all the configurations
3) Select "Edit configuration"
4) Press "+"
5) Select "Android App"
6) Fill the field
   Name: - Android launcher
   Module: - Processing_multiplatform_project_template.app.main
7) Mark: Store as project file
8) Click - Apply
9) Click - OK

Now you can select this configuration. Select your smartphone/tablet in the list of the connected devices and press the green triangle to launch this.

WORK WITH LIBRARIES:

1) If you need to add a library that will be used in the modules - add it simple in the globalLibs folder (for example Box2d for processing).
2) If you need to add a library that will be used only in the desktop version - add it simple in desktop/libs folder.
3) If you need to add a library that will be used only in the android version - add it simple in app/libs folder (for example Ketai library).

WORK WITH ASSETS/DATA:

Graphic, sounds, music, text files you want to use must be added in the app/src/main/Assets folder. To get the full path to this folder from the core module use Interface IEngineWithSpecificFunctions and function getPathToFileInProjectResources. See the example in ProcessingMultiplatformLauncher.java

HOW TO CHANGE THE ANDROID APP ICON:

Replace the file: app/src/main/ic_launcher-playstore.png with your icon.

HOW TO DEVELOP:

Write your main code at class ProcessingMultiplatformLauncher.java inside the core-module. There are functions setup() and draw() which work like the same functions in Processing IDE.

If you need to write a code that will be used only in desktop version: 
1) write it in a new function in DesktopLauncher.java (desktop module).  
2) create the function with the same name and parameters in the interface: IEngineWithSpecificFunctions.java (core module) with no content.
3) create the function with the same name and parameters in the class: AndroidLauncher.java (app module).
To call this function inside the class ProcessingMultiplatformLauncher.java write: engineWithSpecificFunctions.yourFunctionName(yourParameters).

If you need to write a code that will be used only in Android version:
1) write it in a new function in AndroidLauncher.java (app module).
2) create the function with the same name and parameters in the interface: IEngineWithSpecificFunctions.java (core module) with no content.
3) create the function with the same name and parameters in the class: DesktopLauncher.java (desktop module).
   To call this function inside the class ProcessingMultiplatformLauncher.java write: engineWithSpecificFunctions.yourFunctionName(yourParameters).

Created by MGDS Studio. https://mgdsstudio.itch.io
Original repo: https://github.com/MGDSStudio/Processing_multiplatform_project_template.git