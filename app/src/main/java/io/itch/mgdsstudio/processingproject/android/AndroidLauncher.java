/* Created by MGDS Studio
https://mgdsstudio.itch.io
 */

package io.itch.mgdsstudio.processingproject.android;

import io.itch.mgdsstudio.mainpackage.IEngineWithSpecificFunctions;
import io.itch.mgdsstudio.mainpackage.ProcessingMultiplatformLauncher;
import processing.core.PApplet;

public class AndroidLauncher extends PApplet implements IEngineWithSpecificFunctions {
	private ProcessingMultiplatformLauncher processingMultiplatformLauncher;

	public AndroidLauncher() {

	}

	@Override
	public void settings() {
		processingMultiplatformLauncher = new ProcessingMultiplatformLauncher(this, ProcessingMultiplatformLauncher.ANDROID);
		processingMultiplatformLauncher.settings();
	}


	@Override
	public void setup() {
		orientation(LANDSCAPE);
		processingMultiplatformLauncher.setup();
	}



	public void draw() {
		processingMultiplatformLauncher.draw();
	}

	@Override
	public void mousePressed(){
		processingMultiplatformLauncher.mousePressed(mouseX, mouseY);
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
	public void backPressed() {
		processingMultiplatformLauncher.backPressed();
	}

	@Override
	public String getPathToFileInProjectResources(String fileName) {
		return fileName;
	}
}

