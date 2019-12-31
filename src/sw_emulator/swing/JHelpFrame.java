/*
 * @(#)JHelpFrame.java 2019/12/29
 *
 * ICE Team free software group
 *
 * This file is part of JIIT64 Java Ice Team Tracker 64
 * See README for copyright notice.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 */

package sw_emulator.swing;

import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

/**
 * Help frame
 * 
 * @author  ice
 */
public class JHelpFrame extends javax.swing.JFrame {
 
    /** Creates new form JHelpFrame */
    public JHelpFrame() {
      initComponents();       
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDn = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();
        jScrollPaneHelp = new javax.swing.JScrollPane();
        jEditorPaneHelp = new javax.swing.JEditorPane();

        setTitle("JC64dis Help");

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jPanelDn.add(jButtonClose);

        getContentPane().add(jPanelDn, java.awt.BorderLayout.SOUTH);

        jScrollPaneHelp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneHelp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jEditorPaneHelp.setEditable(false);
        jEditorPaneHelp.setContentType("text/html");
        try {
            jEditorPaneHelp.setPage(
                getClass().getResource("/sw_emulator/swing/help/index.html")
            );
        } catch (Exception e) {
            System.err.println(e);
        }
        jEditorPaneHelp.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPaneHelpHyperlinkUpdate(evt);
            }
        });
        jScrollPaneHelp.setViewportView(jEditorPaneHelp);

        getContentPane().add(jScrollPaneHelp, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(567, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
      setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jEditorPaneHelpHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPaneHelpHyperlinkUpdate
      // froom SUN tutorials examples 
      if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
        JEditorPane pane = (JEditorPane) evt.getSource();
        if (evt instanceof HTMLFrameHyperlinkEvent) {
          HTMLFrameHyperlinkEvent  e = (HTMLFrameHyperlinkEvent)evt;
          HTMLDocument doc = (HTMLDocument)pane.getDocument();
            doc.processHTMLFrameHyperlinkEvent(e);
        } else {
            try {
              pane.setPage(evt.getURL());
            } catch (Exception t) {
                System.err.println(t);
              }
          }
       }              
    }//GEN-LAST:event_jEditorPaneHelpHyperlinkUpdate
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHelpFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JEditorPane jEditorPaneHelp;
    private javax.swing.JPanel jPanelDn;
    private javax.swing.JScrollPane jScrollPaneHelp;
    // End of variables declaration//GEN-END:variables
    
}
