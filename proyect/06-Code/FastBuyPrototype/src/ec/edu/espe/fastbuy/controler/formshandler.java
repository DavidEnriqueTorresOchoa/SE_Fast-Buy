/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fastbuy.controler;

import ec.edu.espe.fastbuy.view.frmFastBuy;
import javax.swing.JFrame;

/**
 *
 * @author W10
 */
public class formshandler {
     public static void goToMainScreen(JFrame jFrameToClose)
     {
        frmFastBuy frmFastBuy = new frmFastBuy();
        jFrameToClose.setVisible(false);
        frmFastBuy.setVisible(true); 
     }
     }
