/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swingstoresystem;

import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */
public class SwingStoreSystem {

    public static void main(String[] args) {
        try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) { // Change "Nimbus" to "Windows", "Metal", etc.
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
}
        SwingUtilities.invokeLater(() -> {
            MainSystem frame = new MainSystem();
            frame.setVisible(true);
        });
    }
}
