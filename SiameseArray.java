package MiniProject;

import java.util.Random;
import javax.swing.JOptionPane;

public class SiameseArray extends javax.swing.JFrame {

    public SiameseArray() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        photoSiamese = new javax.swing.JLabel();
        btnShakeSiamese = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Siamese");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("เสี่ยงเซียมซี");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("ผลการทำนาย");

        tarResult.setEditable(false);
        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("TH SarabunPSK", 0, 30)); // NOI18N
        tarResult.setLineWrap(true);
        tarResult.setRows(5);
        tarResult.setToolTipText("");
        tarResult.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tarResult);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        photoSiamese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MiniProject/minu.png"))); // NOI18N

        btnShakeSiamese.setBackground(new java.awt.Color(255, 255, 153));
        btnShakeSiamese.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnShakeSiamese.setText("เขย่าเซียมซี");
        btnShakeSiamese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShakeSiameseActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(photoSiamese)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnShakeSiamese)
                        .addGap(180, 180, 180)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(photoSiamese)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShakeSiamese, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShakeSiameseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShakeSiameseActionPerformed
        String result[] = {"คำทำนายที่สิบเก้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีความร้อนใจด้วยการเจ็บป่วย แต่ลาภผลน้อยนื้อคู่ช่วยท่านได้ แต่ความรักอาจจะมีอุปสรรคบ้าง การงานดี ท่านควรหมั่นไหว้พระกวนอิมโพธิสัตว์สิ่งร้ายอาจจะกลายเป็นดี",
            "คำทำนายที่ยี่สิบ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ ไม่มีอุปสรรคจะทำการใดก็ดีหมด การงานควรระวังการมีปากเสียงกับผู้อื่น เจ็บป่วยไม่มี เนื้อคู่เป็นผู้มีบุญสรรพสิ่งสมประสงค์ดีนักแล",
            "คำทำนายที่ยี่สิบเอ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีโชคลาภและจะมีผู้ใหญ่มาคุ้มครอง การงานเจริญรุ่งเรือง เนื้อคู่อยู่ไม่ไกล เจ็บป่วยจะหายเร็ว สรรพสิ่งสมประสงค์ แต่ควรหมั่นไหว้พระทำบุญสร้างบารมีเอาไว้บ้าง เพื่อภายหน้าลูกหลานจะได้ดีเพราะที่ทำเอาไว้",
            "ทำนายที่ยี่สิบสอง เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนต้นไม้ที่กำลังเขียวชะอุ่ม หมายถึงจะได้ลาภเงินทองไหลมาเทมา การงานจะเจริญก้าวหน้า เนื้อคู่จะเป็นผู้ช่วยให้ท่านเจริญยิ่งขึ้น เจ็บป่วยไม่มี สรรพสิ่งสมดังปรารถนาทุกประการดีนักแล",
            "คำทำนายที่ยี่สิบสาม เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะเกิดด้วยความให้เกรงสตรีเป็นศัตรูจงหนัก มิฉะนั้นจะถูกฟ้องหา เพราะชู้เมีย ไม่ควรเดินทางกลางคืน การงานไม่มีอุปสรรค อาจจะเจ็บป่วยเสียเงินทอง จึงควรไหว้พระให้ท่านคุ้มครองสิ่งต่าง ๆ อาจกลายเป็นดี",
            "คำทำนายที่ยี่สิบสี่ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้รับความร้อนใจมิฉะนั้นอาจจะมีอันตราย การงานมีอุปสรรค เจ็บป่วยหายยาก มีบุตรเลี้ยงยาก จงหมั่นไปไหว้เทพเจ้าแห่งชะตาราศรี (ไท่ส่วย-เอี้ย) แล้วทุกสิ่งจะกลายเป็นดี",
            "คำทำนายที่ยี่สิบห้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ โชคลาภและอำนาจการค้าขายรุ่งเรือง เจ็บป่วยจะมีหมอดีมารักษา เนื้อคู่อยู่ด้วยกันจะประเสริฐ ท่านจะได้บุตรที่ดี สรรพสิ่งสมประสงค์ดีนักแล",
            "คำทำนายที่ยี่สิบหก เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีผู้มาให้โชคลาภ การงานอาจจะมีอุปสรรค เจ็บป่วยหายเร็ว ไม่ช้าจะได้เนื้อคู่ ท่านควรจะหมั่นไหว้พระและเทพเจ้าแห่งโชคลาภ (ใช้ซิ้งเอี้ย) แล้วการค้าจะดี",
            "คำทำนายที่ยี่สิบเจ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะเสียทรัพย์และของรัก จงระวังในการเดินทางไกล การค้าไม่มีโชคลาภ เจ็บป่วยหายยาก ท่านควรจะไปไหว้พระ และขอพรจากเทพเจ้าแห่งยา (หั่วท้อเซียงซือ) แล้วสรรพสิ่งต่าง ๆ จะกลายเป็นดี",
            "คำทำนายที่ยี่สิบแปด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนพระอาทิตย์อันร้อนแรง หมายถึงการงานจะเจริญรุ่งเรือง จ็บป่วยจะมีหมอดีมารักษา จะมีเนื้อคู่ที่พร้อมด้วยทรัพย์สมบัติ สรรพสิ่งที่ขอจะได้สมดังใจหมายแล",
            "คำทำนายที่ยี่สิบเก้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้จะได้ยศฐาบรรดาศักดิ์และสรรพสิ่ง ลาภจะบริบูรณ์ด้วยทรัพย์สมบัติ การงานเจริญรุ่งเรือง ไม่มีโรคภัยอันตราย ความรักสมหวัง สรรพสิ่งไม่มีอุปสรรคดีนักแล",
            "คำทำนายที่สามสิบ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ ไม่สมดังใจหมายจะเกิดความร้อนใจ เจ็บป่วยไข้หายยาก และอาจจะเสียของรักไป ท่านควรจะหมั่นขอพร จากพระกวนอิมโพธิสัตว์และเทพเจ้าแห่งยา(หั่วท้อเซียงซือ) สิ่งร้ายจะกลายเป็นดี",
            "คำทำนายที่สามสิบเอ็ด เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ลาภเพราะความฝัน จะได้ผ้าผ่อนของใช้สอย สรรพสิ่งไม่เหน็ดเหนื่อย การงานไม่มีอุปสรรค อายุยืนยาว จะมีเนื้อคู่และบุตรสุดที่รัก ถ้าเป็นความจะชนะแล",
            "คำทำนายที่สามสิบสอง เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จักได้ลาภแก้วแหวนเงินทอง บริบูรณ์ไปด้วยสมบัติการงานก้าวหน้า อนาคตรุ่งเรือง เนื้อคู่มีบุญ อายุยืนยาว สรรพสิ่งสมดังประสงค์ดีนักแล",
            "คำทำนายที่สามสิบสาม เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เปรียบเหมือนพระอาทิตย์อันร้อนแรง หมายถึงการงานจะเจริญรุ่งเรือง เจ็บป่วยจะมีหมอดีมารักษา จะมีเนื้อคู่ที่พร้อมด้วยทรัพย์สมบัติ สรรพสิ่งที่ขอจะได้สมดังใจหมายแล",
            "คำทำนายที่สามสิบสี่ เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะมีการเจ็บป่วยอยู่บ้าง การค้าขายไม่คล่องตัว โชคลาภยังมีน้อย เนื้อคู่จะช่วยท่านได้ จงหมั่นไหว้พระทำบุญขอพรให้มาก ๆ จะสมปรารถนาทุกประการ",
            "คำทำนายที่สามสิบห้า เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ จะได้ลาภและเนื้อคู่ การงานไม่มีอุปสรรค เจ็บป่วยจะมีหมอดีมารักษา มิฉะนั้นจะมีผู้ใหญ่คุ้มครอง จงหมั่นไหว้พระขอพรจะดีนักแล",
            "คำทำนายที่สามสิบหก เซียมซีใบนี้ว่าด้วย ชะตาชีวิตช่วงนี้ เข้าสู่โชคลาภจะมีผู้สูงอายุมาให้โชค มิฉะนั้นจะมีเนื้อคู่พร้อมด้วยทรัพย์สมบัติ การค้าขายไม่มีอุปสรรค เจ็บป่วยจะมีหมอดีมารักษา สรรพสิ่งดังใจหมาย ถ้าเป็นความจะชนะแล"
        };
        Random rd = new Random();
        int index = rd.nextInt(result.length);
        tarResult.setText(result[index]);
        btnShakeSiamese.setEnabled(false);
    }//GEN-LAST:event_btnShakeSiameseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tarResult.setText("");
        btnShakeSiamese.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(SiameseArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiameseArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiameseArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiameseArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiameseArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShakeSiamese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photoSiamese;
    private javax.swing.JTextArea tarResult;
    // End of variables declaration//GEN-END:variables

}
