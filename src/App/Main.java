package App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import static java.awt.image.ImageObserver.ABORT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    
    DefaultTableModel model;

    public Main() {
        setUndecorated(true);
        initComponents();
        
        Object[] header = {"NO", "Kode Barang", "Nama Barang", "Stok", "Harga",};
        model = new DefaultTableModel(header, 0);
        DataTabel.setModel(model);
        DataTabel.setBackground(Color.decode("#050A30"));
        DataTabel.setRowHeight(30);
        DataTabel.getColumnModel().getColumn(0).setMinWidth(0);
        DataTabel.getColumnModel().getColumn(1).setMinWidth(0);
//        DataTabel.getColumnModel().getColumn(2).setMaxWidth(0);
        DataTabel.getColumnModel().getColumn(3).setMinWidth(150);        
        DataTabel.getColumnModel().getColumn(4).setMaxWidth(150);
        loadData();
        
        setTitle("Banyan Tobacco");
        // Rounded corners
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new App.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        addProduct = new javax.swing.JLabel();
        updateProduct = new javax.swing.JLabel();
        deleteProduct = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        menu = new App.SlidePanel();
        DashboardPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        ProductOut = new App.MainCard();
        jLabel8 = new javax.swing.JLabel();
        jmlOut = new javax.swing.JLabel();
        jumlaTotal = new App.MainCard();
        jLabel6 = new javax.swing.JLabel();
        totalProduct = new javax.swing.JLabel();
        ProductIn = new App.MainCard();
        jLabel10 = new javax.swing.JLabel();
        jmlIn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        panelBorder1.setForeground(new java.awt.Color(0, 0, 204));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dashboard.png"))); // NOI18N
        jLabel1.setText("Dashboard");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        addProduct.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        addProduct.setForeground(new java.awt.Color(255, 255, 255));
        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon__product_in.png"))); // NOI18N
        addProduct.setText("Add Product");
        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addProductMousePressed(evt);
            }
        });
        panelBorder1.add(addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        updateProduct.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        updateProduct.setForeground(new java.awt.Color(255, 255, 255));
        updateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product.png"))); // NOI18N
        updateProduct.setText("Update Product");
        updateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateProductMousePressed(evt);
            }
        });
        panelBorder1.add(updateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        deleteProduct.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product_out.png"))); // NOI18N
        deleteProduct.setText("Delete Product");
        deleteProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteProductMousePressed(evt);
            }
        });
        panelBorder1.add(deleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        exit.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        panelBorder1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));
        panelBorder1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        DashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 1.png"))); // NOI18N
        closeButton.setAlignmentY(0.0F);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeButtonMousePressed(evt);
            }
        });
        DashboardPanel.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Out");

        jmlOut.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jmlOut.setForeground(new java.awt.Color(255, 255, 255));
        jmlOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmlOut.setText("0");

        javax.swing.GroupLayout ProductOutLayout = new javax.swing.GroupLayout(ProductOut);
        ProductOut.setLayout(ProductOutLayout);
        ProductOutLayout.setHorizontalGroup(
            ProductOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductOutLayout.createSequentialGroup()
                .addGroup(ProductOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductOutLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jmlOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductOutLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        ProductOutLayout.setVerticalGroup(
            ProductOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductOutLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmlOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        DashboardPanel.add(ProductOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 220, 110));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Product");

        totalProduct.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        totalProduct.setForeground(new java.awt.Color(255, 255, 255));
        totalProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalProduct.setText("0");

        javax.swing.GroupLayout jumlaTotalLayout = new javax.swing.GroupLayout(jumlaTotal);
        jumlaTotal.setLayout(jumlaTotalLayout);
        jumlaTotalLayout.setHorizontalGroup(
            jumlaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlaTotalLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53))
            .addGroup(jumlaTotalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(totalProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jumlaTotalLayout.setVerticalGroup(
            jumlaTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlaTotalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        DashboardPanel.add(jumlaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 110));

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Product In");

        jmlIn.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jmlIn.setForeground(new java.awt.Color(255, 255, 255));
        jmlIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmlIn.setText("0");

        javax.swing.GroupLayout ProductInLayout = new javax.swing.GroupLayout(ProductIn);
        ProductIn.setLayout(ProductInLayout);
        ProductInLayout.setHorizontalGroup(
            ProductInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductInLayout.createSequentialGroup()
                .addGroup(ProductInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductInLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jmlIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductInLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel10)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        ProductInLayout.setVerticalGroup(
            ProductInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductInLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jmlIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        DashboardPanel.add(ProductIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 220, 110));

        jScrollPane1.setName(""); // NOI18N

        DataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok ", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DataTabel);

        DashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 840, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dasbord.png"))); // NOI18N
        DashboardPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 940, 680));

        panelBorder1.add(DashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 900, 680));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panelBorder1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 60));

        getContentPane().add(panelBorder1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProductMousePressed
        // TODO add your handling code here:
        
        int baris = DataTabel.getSelectedRow();
        if (baris != -1) {
            int kode = Integer.parseInt(DataTabel.getValueAt(baris, 1).toString()) ;
            String nama = DataTabel.getValueAt(baris, 2).toString();
            String stok = DataTabel.getValueAt(baris, 3).toString();
            String harga = DataTabel.getValueAt(baris, 4).toString();
            
            Resources d = new Resources();
            d.setNama_barang(nama);
            d.setStok_barang(stok);
            d.setHarga_barang(harga);
            
            Update up = new Update(d);
            up.setVisible(true);
            
        }
    }//GEN-LAST:event_updateProductMousePressed

    private void addProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMousePressed
        // TODO add your handling code here:
        Add plus = new Add();
        plus.setVisible(true);
        loadData();
        
    }//GEN-LAST:event_addProductMousePressed

    private void deleteProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductMousePressed
        // TODO add your handling code here:
        
        int r = DataTabel.getSelectedRow();
        if (r != -1) {
            int kode = Integer.parseInt(DataTabel.getValueAt(r, 1).toString());
            int pilih = JOptionPane.showConfirmDialog(this,""
                + "Apakah anda yakin ?","Konfirmasi",
                JOptionPane.YES_NO_OPTION);
            if (pilih  == 0) {

                try {
                    Connection c = Koneksi.MySQl();
                    Statement st = c.createStatement();
                    String q = "DELETE FROM barang WHERE kode_barang="+kode+"";
                    st.executeUpdate(q);
                    loadData();
                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        } else {
        
        }
    }//GEN-LAST:event_deleteProductMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(this, "Sign Out from Applications ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            dispose();
            this.setVisible(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            new Login().setVisible(true);
        } else {
            this.setDefaultCloseOperation(ABORT);
        }
    }//GEN-LAST:event_exitMousePressed

    private void closeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMousePressed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(this, "EXIT Applications ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            dispose();
            this.setVisible(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(ABORT);
        }
    }//GEN-LAST:event_closeButtonMousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JTable DataTabel;
    private App.MainCard ProductIn;
    private App.MainCard ProductOut;
    private javax.swing.JLabel addProduct;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel deleteProduct;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jmlIn;
    private javax.swing.JLabel jmlOut;
    private App.MainCard jumlaTotal;
    private App.SlidePanel menu;
    private App.PanelBorder panelBorder1;
    private javax.swing.JLabel totalProduct;
    private javax.swing.JLabel updateProduct;
    // End of variables declaration//GEN-END:variables
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resource/Icon-frame.png")));
    }
    
    public void TambahComponent(JPanel panel) {
        if (DashboardPanel.getComponentCount() > 0) {
            panelBorder1.removeAll();
        }
        panelBorder1.add(panel, BorderLayout.CENTER);
        DashboardPanel.revalidate();
        DashboardPanel.repaint();
    }
    
    public void rmBgColorLbl(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255, 0));
        lbl.removeAll();
        lbl.setOpaque(false);
    }
    
    public void setBgColorLbl(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255, 50));
        lbl.setOpaque(true);
    }
    
    
    
    
    public void loadData() {
        try {
            model.setRowCount(0);
            Connection c = Koneksi.MySQl();
            Statement st = c.createStatement();            
//            String where = key.isEmpty()?"":"WHERE kode_barang LIKE '%"+key+"%' OR nama_barang LIKE '%"+key+"%' OR stok_barang LIKE '%"+key+"%' OR harga_barang LIKE '%"+key+"%'";
            
            ResultSet rs = st.executeQuery("SELECT * FROM barang");
            int no = 0;
            int In = 0;
            int Out = 0;
            while (rs.next()) {                
                no++;
                int kode_barang = rs.getInt("kode_barang");
                String nama_barang = rs.getString("nama_barang");
                String stok_barang = rs.getString("stok_barang");
                String harga_barang = rs.getString("harga_barang");
                Object[] data = {no,kode_barang,nama_barang,stok_barang,harga_barang};
                int jumlah = data.length-1;
                model.addRow(data);
                
                if(stok_barang.equals("product in")) {
                    In++;
                } else if(stok_barang.equals("product out")) {
                    Out++;
                }
            }
            totalProduct.setText(""+ no);
            jmlIn.setText("" + In);
            jmlOut.setText("" + Out);
            System.out.println(no);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
