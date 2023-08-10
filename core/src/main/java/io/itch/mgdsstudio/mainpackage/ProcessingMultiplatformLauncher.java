/* Created by MGDS Studio
https://mgdsstudio.itch.io
 */

package io.itch.mgdsstudio.mainpackage;


import processing.core.PApplet;
import processing.core.PImage;


public class ProcessingMultiplatformLauncher {
    public static final boolean ANDROID = false, DESKTOP = true;
    private boolean os;
    private PApplet processing;
    private IEngineWithSpecificFunctions engineWithSpecificFunctions;
    private PImage picture;

    public ProcessingMultiplatformLauncher(PApplet engine, boolean os){
        this.processing = engine;
        engineWithSpecificFunctions = (IEngineWithSpecificFunctions) engine;
        this.os = os;
    }

    public void settings(){
        processing.size(1280, 720);
    }

    public void setup(){
        processing.frameRate(60);
        if (os == ANDROID) picture = processing.loadImage(engineWithSpecificFunctions.getPathToFileInProjectResources("Android_screen.png"));
        else picture = processing.loadImage(engineWithSpecificFunctions.getPathToFileInProjectResources("Desktop_screen.png"));
    }

    public void draw(){
       processing.image(picture,0,0,processing.width, processing.height);
    }



    public void backPressed() {

    }

    public PApplet getEngine() {
        return processing;
    }

    public void mouseWheelBackward() {
    }

    public void mouseWheelForward() {
    }

    public void keyPressed(int keyCode, char key) {
    }

    public void keyReleased(int keyCode, char key) {

    }

    public void mousePressed(int mouseX, int mouseY) {

    }
}
