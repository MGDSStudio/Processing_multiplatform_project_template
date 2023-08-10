/* Created by MGDS Studio
https://mgdsstudio.itch.io
 */

package io.itch.mgdsstudio.processingproject.desktop;

import io.itch.mgdsstudio.mainpackage.IEngineWithSpecificFunctions;
import io.itch.mgdsstudio.mainpackage.ProcessingMultiplatformLauncher;
import processing.core.PApplet;
import processing.event.MouseEvent;
import java.io.File;

public class DesktopLauncher extends PApplet implements IEngineWithSpecificFunctions {
    private final String PATH_TO_ASSETS = "app"+ File.separator + "src"+ File.separator + "main"+ File.separator + "Assets" + File.separator ;
    private ProcessingMultiplatformLauncher processingMultiplatformLauncher;

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "io.itch.mgdsstudio.processingproject.desktop.DesktopLauncher" };
        if (passedArgs != null) {
            try {
                PApplet.main(PApplet.concat(appletArgs, passedArgs));
            }
            catch (Exception e){
                e.printStackTrace();
                PApplet.main(appletArgs);
            }
        } else {
            PApplet.main(appletArgs);
        }
        System.out.println("Desktop version loaded successfully");
    }




    @Override
    public void settings() {
        processingMultiplatformLauncher = new ProcessingMultiplatformLauncher(this, ProcessingMultiplatformLauncher.DESKTOP);
        processingMultiplatformLauncher.settings();
    }

    @Override
    public void setup() {
        getSurface().setLocation(0,0);
        getSurface().setTitle("Desktop version. MGDS Studio");
        processingMultiplatformLauncher.setup();
    }


    @Override
    public void draw() {
        processingMultiplatformLauncher.draw();
    }

    @Override
    public void mousePressed(){
        processingMultiplatformLauncher.mousePressed(mouseX, mouseY);
    }


    @Override
    public void mouseWheel(MouseEvent event) {
        float e = event.getCount();
        if (e>0) processingMultiplatformLauncher.mouseWheelBackward();
        else if (e<0) processingMultiplatformLauncher.mouseWheelForward();
    }


    @Override
    public void keyPressed() {
        processingMultiplatformLauncher.keyPressed(keyCode, key);
    }

    @Override
    public void keyReleased() {
        processingMultiplatformLauncher.keyReleased(keyCode, key);
    }


    @Override
    public String getPathToFileInProjectResources(String fileName) {
        return PATH_TO_ASSETS+fileName;
    }

}
