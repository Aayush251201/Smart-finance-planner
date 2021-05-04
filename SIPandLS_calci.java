
import java.awt.Color;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aayush
 */
public class SIPandLS_calci extends javax.swing.JFrame {

    /**
     * Creates new form SIPandLS_calci
     */
    public SIPandLS_calci() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        calculate.setVisible(false);
        moninv.setEnabled(false);
        retns.setEnabled(false);
        invper.setEnabled(false);
        infy.setEnabled(false);
        infn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        hlin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sippan = new javax.swing.JPanel();
        siptxt = new javax.swing.JLabel();
        LSpan = new javax.swing.JPanel();
        LStxt = new javax.swing.JLabel();
        mainpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        moninv = new javax.swing.JTextField();
        retns = new javax.swing.JTextField();
        invper = new javax.swing.JTextField();
        infy = new javax.swing.JRadioButton();
        infn = new javax.swing.JRadioButton();
        calculate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        expamnt = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        invamt = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        wealthg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(118, 255, 3));

        hlin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        hlin.setForeground(new java.awt.Color(46, 49, 50));
        hlin.setText("Smart Finance Planner");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(hlin, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hlin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1630, 60);

        jPanel1.setBackground(new java.awt.Color(46, 49, 50));

        sippan.setBackground(new java.awt.Color(46, 49, 50));
        sippan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 49, 50), 1, true));
        sippan.setPreferredSize(new java.awt.Dimension(207, 37));
        sippan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sippanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sippanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sippanMouseExited(evt);
            }
        });

        siptxt.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        siptxt.setForeground(new java.awt.Color(255, 255, 255));
        siptxt.setText("SIP");

        javax.swing.GroupLayout sippanLayout = new javax.swing.GroupLayout(sippan);
        sippan.setLayout(sippanLayout);
        sippanLayout.setHorizontalGroup(
            sippanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sippanLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(siptxt)
                .addGap(74, 74, 74))
        );
        sippanLayout.setVerticalGroup(
            sippanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(siptxt, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        LSpan.setBackground(new java.awt.Color(46, 49, 50));
        LSpan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 49, 50), 1, true));
        LSpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LSpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LSpanMouseExited(evt);
            }
        });

        LStxt.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        LStxt.setForeground(new java.awt.Color(255, 255, 255));
        LStxt.setText("LUMP SUM");

        javax.swing.GroupLayout LSpanLayout = new javax.swing.GroupLayout(LSpan);
        LSpan.setLayout(LSpanLayout);
        LSpanLayout.setHorizontalGroup(
            LSpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LSpanLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(LStxt)
                .addGap(19, 19, 19))
        );
        LSpanLayout.setVerticalGroup(
            LSpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LSpanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LStxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainpan.setBackground(new java.awt.Color(46, 49, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monthly Investment:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Expected Annual Returns(%):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Investment Period(years):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adjust Inflation:");

        moninv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        retns.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        invper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        infy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infy.setForeground(new java.awt.Color(255, 255, 255));
        infy.setText("YES");
        infy.setPreferredSize(new java.awt.Dimension(7, 28));
        infy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infyMouseClicked(evt);
            }
        });

        infn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infn.setForeground(new java.awt.Color(255, 255, 255));
        infn.setText("NO");
        infn.setPreferredSize(new java.awt.Dimension(7, 28));
        infn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infnMouseClicked(evt);
            }
        });

        calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculate.setText("CALCULATE");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainpanLayout = new javax.swing.GroupLayout(mainpan);
        mainpan.setLayout(mainpanLayout);
        mainpanLayout.setHorizontalGroup(
            mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moninv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retns, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invper, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainpanLayout.createSequentialGroup()
                        .addComponent(infy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        mainpanLayout.setVerticalGroup(
            mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moninv)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(retns))
                .addGap(71, 71, 71)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(invper))
                .addGap(73, 73, 73)
                .addGroup(mainpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(infy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jPanel3.setBackground(new java.awt.Color(46, 49, 50));

        jPanel4.setBackground(new java.awt.Color(46, 49, 50));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expected Amount ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        expamnt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        expamnt.setForeground(new java.awt.Color(118, 255, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expamnt, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expamnt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(46, 49, 50));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invested Amount ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        invamt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        invamt.setForeground(new java.awt.Color(118, 255, 3));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invamt, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invamt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(46, 49, 50));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Wealth Gained ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        wealthg.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        wealthg.setForeground(new java.awt.Color(118, 255, 3));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wealthg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wealthg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(sippan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LSpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LSpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sippan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1570, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sippanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sippanMouseEntered
        Color c=new Color(71,83,94);
        sippan.setBackground(c);
    }//GEN-LAST:event_sippanMouseEntered

    private void sippanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sippanMouseExited
        Color c=new Color(46,49,50);
        sippan.setBackground(c);
    }//GEN-LAST:event_sippanMouseExited

    private void sippanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sippanMouseClicked
        moninv.setEnabled(true);
        retns.setEnabled(true);
        invper.setEnabled(true);
        infy.setEnabled(true);
        infn.setEnabled(true);
        Color c=new Color(118,255,3);
        siptxt.setForeground(c);
        Border border=BorderFactory.createLineBorder(c,3);
        sippan.setBorder(border);
        Color c1=new Color(255,255,255);
        LStxt.setForeground(c1);
        Color c2=new Color(46,49,50);
        Border b=BorderFactory.createLineBorder(c2);
        LSpan.setBorder(b);
        mainpan.setBorder(border);
        calculate.setBackground(c);
        jLabel1.setText("Monthly Investment:");
        calculate.setVisible(true);
    }//GEN-LAST:event_sippanMouseClicked

    private void LSpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSpanMouseClicked
        moninv.setEnabled(true);
        retns.setEnabled(true);
        invper.setEnabled(true);
        infy.setEnabled(true);
        infn.setEnabled(true);
        Color c=new Color(0,176,255);
        LStxt.setForeground(c);
        Border border=BorderFactory.createLineBorder(c,3);
        LSpan.setBorder(border);
        Color c1=new Color(255,255,255);
        siptxt.setForeground(c1);
        Color c2=new Color(46,49,50);
        Border b=BorderFactory.createLineBorder(c2);
        sippan.setBorder(b);
        mainpan.setBorder(border);
        calculate.setBackground(c);
        jLabel1.setText("Investment Amount:");
        calculate.setVisible(true);
    }//GEN-LAST:event_LSpanMouseClicked

    private void LSpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSpanMouseEntered
        Color c=new Color(71,83,94);
        LSpan.setBackground(c);
    }//GEN-LAST:event_LSpanMouseEntered

    private void LSpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSpanMouseExited
        Color c=new Color(46,49,50);
        LSpan.setBackground(c);
    }//GEN-LAST:event_LSpanMouseExited

    private void infyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infyMouseClicked
        Color c=new Color(118,255,3);
        infy.setForeground(c);
        infn.setSelected(false);
        Color c1=new Color(255,255,255);
        infn.setForeground(c1);
        Border b=BorderFactory.createLineBorder(c);
        infy.setBorder(b);
    }//GEN-LAST:event_infyMouseClicked

    private void infnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infnMouseClicked
        Color c=new Color(118,255,3);
        infn.setForeground(c);
        infy.setSelected(false);
        Color c1=new Color(255,255,255);
        infy.setForeground(c1);
        Border b=BorderFactory.createLineBorder(c);
        infn.setBorder(b);
    }//GEN-LAST:event_infnMouseClicked

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        if(jLabel1.getText().equals("Monthly Investment:"))
        {
            Color c=new Color(118,255,3);
            Border b=BorderFactory.createLineBorder(c,2);
            jPanel3.setBorder(b);
            BigInteger mi,per,ia,retr;
            mi=BigInteger.valueOf(Long.parseLong(moninv.getText()));
            per=BigInteger.valueOf(Long.parseLong(invper.getText())*12);
            retr=BigInteger.valueOf(Long.parseLong(retns.getText()));
            ia=mi.multiply(per);
            invamt.setText("₹ "+ia);
            if(infn.isSelected())
            {
                double ans=(Double.parseDouble(moninv.getText())*(-1+Math.pow((1+(Double.parseDouble(retns.getText())/1200)),(Double.parseDouble(invper.getText())*12)))*(1+(Double.parseDouble(retns.getText())/1200)))/(Double.parseDouble(retns.getText())/1200);
                BigInteger finans;
                finans=BigInteger.valueOf(Math.round(ans));
                expamnt.setText("₹ "+finans);
                wealthg.setText("₹ "+finans.subtract(ia));
            }
            else
            {
                double ans=(Double.parseDouble(moninv.getText())*(-1+Math.pow((1+((Double.parseDouble(retns.getText())-6)/1200)),(Double.parseDouble(invper.getText())*12)))*(1+((Double.parseDouble(retns.getText())-6)/1200)))/((Double.parseDouble(retns.getText())-6)/1200);
                BigInteger finans;
                finans=BigInteger.valueOf(Math.round(ans));
                expamnt.setText("₹ "+finans);
                wealthg.setText("₹ "+finans.subtract(ia));
            }
            
            
        }
        else
        {
            Color c=new Color(0,176,255);
            Border b=BorderFactory.createLineBorder(c,2);
            jPanel3.setBorder(b);
            BigInteger ia;
            ia=BigInteger.valueOf(Long.parseLong(moninv.getText()));
            invamt.setText("₹ "+ia);
            if(infn.isSelected())
            {
                double ans=Double.parseDouble(moninv.getText())*Math.pow((1+Double.parseDouble(retns.getText())/100),Double.parseDouble(invper.getText()));
                BigInteger finans;
                finans=BigInteger.valueOf(Math.round(ans));
                expamnt.setText("₹ "+finans);
                wealthg.setText("₹ "+finans.subtract(ia));
            }
            else
            {
                double ans=Double.parseDouble(moninv.getText())*Math.pow((1+(Double.parseDouble(retns.getText())-6)/100),Double.parseDouble(invper.getText()));
                BigInteger finans;
                finans=BigInteger.valueOf(Math.round(ans));
                expamnt.setText("₹ "+finans);
                wealthg.setText("₹ "+finans.subtract(ia));
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Page1 obj=new Page1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIPandLS_calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIPandLS_calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIPandLS_calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIPandLS_calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIPandLS_calci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LSpan;
    private javax.swing.JLabel LStxt;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel expamnt;
    private javax.swing.JLabel hlin;
    private javax.swing.JRadioButton infn;
    private javax.swing.JRadioButton infy;
    private javax.swing.JLabel invamt;
    private javax.swing.JTextField invper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel mainpan;
    private javax.swing.JTextField moninv;
    private javax.swing.JTextField retns;
    private javax.swing.JPanel sippan;
    private javax.swing.JLabel siptxt;
    private javax.swing.JLabel wealthg;
    // End of variables declaration//GEN-END:variables
}