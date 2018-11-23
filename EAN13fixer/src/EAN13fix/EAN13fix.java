/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EAN13fix;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Admin
 */
public class EAN13fix extends MIDlet implements CommandListener, ItemStateListener {
    
    private boolean midletPaused = false;
    private Image OCRBFont;
    private static final int[] LCodes = {13, 25, 19, 61, 35, 49, 47, 59, 55, 11};
    //RCode = LCode ^ 127
    private static final int[] GCodes = {39, 51, 27, 33, 29, 57, 5, 17, 9, 23};
    private static final int[] LGPatt = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private static final int[] ix = {0, 103, 48, 59, 92, 70, 24, 80, 12, 36, 111};
    private static final int[] wid = {11, 7, 10, 10, 10, 9, 11, 11, 11, 11, 10};
    private static final int[] hei = {17, 15, 16, 16, 15, 16, 16, 15, 17, 16, 13};
    private static final int[] xof = {2, 3, 2, 2, 2, 3, 2, 2, 2, 2, 2};
    private static final int[] yof = {0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 2};
    private String errtxt="";

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command itemCommand;
    private Form form;
    private TextField textField;
    private TextField textField1;
    private ImageItem imageItem;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public EAN13fix() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
        try {
            OCRBFont = Image.createImage("/ocrb.png");
        } catch (Exception exc) {
            errtxt = exc.getMessage();
        }
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|3|7-postCommandAction
        }//GEN-END:|7-commandAction|3|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|4|
//</editor-fold>//GEN-END:|7-commandAction|4|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form("EAN13 fixer", new Item[]{getTextField(), getTextField1(), getImageItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
            form.setItemStateListener(this);
            if (errtxt != "")
                form.setTitle(errtxt);
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {
//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
textField = new TextField("Input code", null, 13, TextField.NUMERIC);//GEN-LINE:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|23-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {
//GEN-END:|24-getter|0|24-preInit
 // write pre-init user code here
textField1 = new TextField("Corrected", null, 32, TextField.ANY | TextField.UNEDITABLE);//GEN-LINE:|24-getter|1|24-postInit
 // write post-init user code here
}//GEN-BEGIN:|24-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|24-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of itemCommand component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {
//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|25-getter|1|25-postInit
 // write post-init user code here
}//GEN-BEGIN:|25-getter|2|
        return itemCommand;
    }
//</editor-fold>//GEN-END:|25-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItem ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of imageItem component.
     *
     * @return the initialized component instance
     */
    public ImageItem getImageItem() {
        if (imageItem == null) {//GEN-END:|26-getter|0|26-preInit
 // write pre-init user code here
imageItem = new ImageItem("Barcode", null, ImageItem.LAYOUT_DEFAULT, "<Missing Image>", Item.PLAIN);//GEN-LINE:|26-getter|1|26-postInit
 // write post-init user code here
}//GEN-BEGIN:|26-getter|2|
        return imageItem;
    }
//</editor-fold>//GEN-END:|26-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    private int drawLines(int startY, Graphics gr, String pattern,
            boolean islong) {
        int startX = islong ? 9 : 19;
        for (int i = 0; i<pattern.length(); i++) {
            if ((pattern.charAt(i) & 1) != 0) {
                gr.drawLine(startX, startY, 156, startY);
                gr.drawLine(startX, startY + 1, 156, startY + 1);
            }
            startY += 2;
        }
        return startY;
    }
    public void itemStateChanged(Item item) {
        if(item.equals(getTextField())){
            String s = textField.getString();
            if ((s.length()>0)&&(s.charAt(0)=='-')) {
                s = s.substring(1);
                textField.setString(s);
            }
            if (s.length()<12) {
                String ns = new String(new char[12-s.length()]).replace('\0', '0');
                s += ns;
            }
            if (s.length()>12) {
                s = s.substring(0, 12);
            }
            int odd = 0;
            int even = 0;
            for (int i = 0; i < 6; i++) {
                odd += s.charAt(i * 2) - 48;
                even += s.charAt(i * 2 + 1) - 48;
            }
            odd = (10 + (even % 10) * 7 - (odd % 10)) % 10;
            s += odd;
            Image im = Image.createImage(157, 226);
            Graphics gr = im.getGraphics();
            int c = s.charAt(0) - 48;
            Image im2 = Image.createImage(OCRBFont, 18 - hei[c], ix[c], hei[c],
                    wid[c], 0);
            gr.drawImage(im2, 17-hei[c]-yof[c], xof[c], 0);
            int curY = 22;
            curY = drawLines(curY, gr, "101", true);
            int LGPat = LGPatt[s.charAt(0) - 48];
            for (int i = 1; i < 7; i++) {
                c = s.charAt(i) - 48;
                im2 = Image.createImage(OCRBFont, 18 - hei[c], ix[c], hei[c],
                    wid[c], 0);
                gr.drawImage(im2, 17-hei[c]-yof[c], curY+xof[c], 0);
                String s2 = Integer.toBinaryString(((LGPat >> (6-i))&1) != 0?GCodes[c]:LCodes[c]);
                if (s2.length() < 7)
                    s2 = (new String(new char[7-s2.length()]).replace('\0', '0'))+s2;
                curY = drawLines(curY, gr, s2, false);
            }
            curY = drawLines(curY, gr, "01010", true);
            for (int i = 7; i < 13; i++) {
                c = s.charAt(i) - 48;
                im2 = Image.createImage(OCRBFont, 18 - hei[c], ix[c], hei[c],
                    wid[c], 0);
                gr.drawImage(im2, 17-hei[c]-yof[c], curY+xof[c], 0);
                String s2 = Integer.toBinaryString(LCodes[c]^127);
                if (s2.length() < 7)
                    s2 = (new String(new char[7-s2.length()]).replace('\0', '0'))+s2;
                curY = drawLines(curY, gr, s2, false);
            }
            curY = drawLines(curY, gr, "101", true);
            im2 = Image.createImage(OCRBFont, 18 - hei[10], ix[10], hei[10],
                    wid[10], 0);
            gr.drawImage(im2, 17-hei[10]-yof[10], curY+xof[10], 0);
            
            imageItem.setImage(im);
            textField1.setString(s);
        }

    }
}
