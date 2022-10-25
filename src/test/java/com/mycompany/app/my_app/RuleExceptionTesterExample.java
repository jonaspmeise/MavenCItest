package com.mycompany.app.my_app;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class RuleExceptionTesterExample {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void throwsIllegalArgumentExceptionIfNumberIsNegative() {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("Negative value not allowed");
    Calculator t = new Calculator();
    t.squareRoot(-1);
  }
   
  @Rule
  public TemporaryFolder folder = new TemporaryFolder();

  @Test
  public void testUsingTempFolder() throws IOException {
	File createdFolder = folder.newFolder("newfolder");
	File createdFile = folder.newFile("myfilefile.txt");
	assertTrue(createdFile.exists());
	assertTrue(createdFolder.exists());
	//Kommentar dort
  }
}