/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.CarDetails;
import Model.CarHistory;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swathisharma
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    
    CarHistory history;
    
    public ViewJPanel(CarHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable(); 
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtRegDate = new javax.swing.JTextField();
        txtCarMake = new javax.swing.JTextField();
        txtCarModel = new javax.swing.JTextField();
        txtSerialNum = new javax.swing.JTextField();
        lblcarMake = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblCarModel = new javax.swing.JLabel();
        txtNumSeats = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblCarSerial = new javax.swing.JLabel();
        lblNumSeats = new javax.swing.JLabel();
        lblRegDate = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblcertExpiry = new javax.swing.JLabel();
        chkBoxAvailable = new java.awt.Checkbox();
        chkBoxExpiry = new java.awt.Checkbox();
        btnAllAvailableCars = new javax.swing.JButton();
        btnFirstAvailableCar = new javax.swing.JButton();
        btnCarAvailabilityStatus = new javax.swing.JButton();
        lblCountAvlCars = new javax.swing.JLabel();
        txtCountUnAvlCars = new javax.swing.JTextField();
        lblCountUnAvlCars = new javax.swing.JLabel();
        txtCountAvlCars = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblupdatedate = new javax.swing.JLabel();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Car Model", "Car Model Number", "Number of Seats", "City", "Availability", "Certificate Expiry"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        txtCarMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarMakeActionPerformed(evt);
            }
        });

        lblcarMake.setText("Car Model");

        lblCarModel.setText("Car Model Number");

        lblYear.setText("Manufacture Year");

        lblCarSerial.setText("Car Serial Number");

        lblNumSeats.setText("Number of Seats");

        lblRegDate.setText("Registration Date");

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        lblAvailability.setText("Availability");

        lblcertExpiry.setText("Certificate Expiry (Yes/No)");

        chkBoxAvailable.setLabel("YES");

        chkBoxExpiry.setLabel("YES");

        btnAllAvailableCars.setText("ALL AVAILABLE CARS");
        btnAllAvailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllAvailableCarsActionPerformed(evt);
            }
        });

        btnFirstAvailableCar.setText("FIRST AVAILABLE CAR");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        btnCarAvailabilityStatus.setText("AVAILABILITY STATUS");
        btnCarAvailabilityStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarAvailabilityStatusActionPerformed(evt);
            }
        });

        lblCountAvlCars.setText("AVAILABLE CARS");

        txtCountUnAvlCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountUnAvlCarsActionPerformed(evt);
            }
        });

        lblCountUnAvlCars.setText("UNAVAILABLE CARS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sinhala MN", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW CAR DETAILS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcertExpiry)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCarSerial)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumSeats)
                                    .addComponent(lblYear)
                                    .addComponent(lblRegDate)
                                    .addComponent(lblCity)))
                            .addComponent(lblcarMake)
                            .addComponent(lblAvailability))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkBoxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkBoxExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountUnAvlCars)
                            .addComponent(lblCountAvlCars))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCountAvlCars, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountUnAvlCars, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 795, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCarModel)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblupdatedate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(btnSearch)
                        .addGap(51, 51, 51)
                        .addComponent(btnView)
                        .addGap(50, 50, 50)
                        .addComponent(btnUpdate)
                        .addGap(53, 53, 53)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(917, 917, 917)
                        .addComponent(btnFirstAvailableCar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(917, 917, 917)
                        .addComponent(btnAllAvailableCars))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(917, 917, 917)
                        .addComponent(btnCarAvailabilityStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCarMake, txtCarModel, txtCity, txtNumSeats, txtRegDate, txtSerialNum, txtYear});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAllAvailableCars, btnCarAvailabilityStatus, btnFirstAvailableCar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCountAvlCars, txtCountUnAvlCars});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnSearch))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcarMake)
                                .addGap(37, 37, 37)
                                .addComponent(lblCarModel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lblCarSerial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumSeats))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblYear))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegDate))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAllAvailableCars)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFirstAvailableCar)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnCarAvailabilityStatus)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCountAvlCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCountAvlCars))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCountUnAvlCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCountUnAvlCars))))
                                .addGap(3, 3, 3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblupdatedate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBoxAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailability))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkBoxExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcertExpiry))
                .addGap(722, 722, 722))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCarMake, txtCarModel, txtNumSeats, txtRegDate, txtSerialNum, txtYear});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAllAvailableCars, btnCarAvailabilityStatus, btnFirstAvailableCar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCountAvlCars, txtCountUnAvlCars});

    }// </editor-fold>//GEN-END:initComponents

    private void txtCarMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarMakeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = jTable.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            
            return;
        }
        
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            
            CarDetails selectedCar = (CarDetails) model.getValueAt(selectedRowIndex, 0);
            
            txtCarMake.setText(selectedCar.getCarModel());
            txtCarModel.setText(selectedCar.getCarModelNumber());
            txtSerialNum.setText(selectedCar.getCarSerialNumber());
            txtRegDate.setText(selectedCar.getRegDate());
            txtYear.setText(String.valueOf(selectedCar.getYear()));
            txtCity.setText(selectedCar.getCity());
            txtNumSeats.setText(String.valueOf(selectedCar.getNumOfSeats()));
            chkBoxAvailable.setState(selectedCar.Availability());
            chkBoxExpiry.setState(selectedCar.isExpiry());



           
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
         int i = jTable.getSelectedRow();
          DefaultTableModel model = (DefaultTableModel) jTable.getModel();
          
          if(i>=0)
              
            
                
          {
             
             model.setValueAt(txtCarMake.getText(), i, 0);;
             model.setValueAt(txtCarModel.getText(), i, 1);
             model.setValueAt(txtNumSeats.getText(), i, 2);
             model.setValueAt(txtCity.getText(), i, 3);
             model.setValueAt(chkBoxAvailable.getState(), i, 4);
             model.setValueAt(chkBoxExpiry.getState(), i, 5);

          }

         
         else
          {
              JOptionPane.showMessageDialog(null, "Error");
          }

//updateTable();

            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        
            int selectedRowIndex = jTable.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
            return;
        }
        
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            
            CarDetails selectedCar = (CarDetails) model.getValueAt(selectedRowIndex, 0);
            
            history.deleteCar(selectedCar);
            
            JOptionPane.showMessageDialog(this, "Car details delete");

            populateTable();
            
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        
           SearchFilter sf = new SearchFilter(history);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAllAvailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllAvailableCarsActionPerformed

        String isAvailable = "true";
        populateTableAvailable();

    }//GEN-LAST:event_btnAllAvailableCarsActionPerformed

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
      String isAvailable = "true";
      populateTableFirstAvailable();
    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnCarAvailabilityStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarAvailabilityStatusActionPerformed
        int totalCarAvl = 0;
        int countCarAvl = 0;
        int countUnAvlCar = 0;
        for(CarDetails cd: history.getHistory()) {
            totalCarAvl++;
            if (cd.Availability() == true) {
                countCarAvl++;
            }
        }
        countUnAvlCar = totalCarAvl - countCarAvl;
        txtCountAvlCars.setText(String.valueOf(countCarAvl));
        txtCountUnAvlCars.setText(String.valueOf(countUnAvlCar));
    }//GEN-LAST:event_btnCarAvailabilityStatusActionPerformed

    private void txtCountUnAvlCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountUnAvlCarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountUnAvlCarsActionPerformed

    
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllAvailableCars;
    private javax.swing.JButton btnCarAvailabilityStatus;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private java.awt.Checkbox chkBoxAvailable;
    private java.awt.Checkbox chkBoxExpiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCarModel;
    private javax.swing.JLabel lblCarSerial;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountAvlCars;
    private javax.swing.JLabel lblCountUnAvlCars;
    private javax.swing.JLabel lblNumSeats;
    private javax.swing.JLabel lblRegDate;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblcarMake;
    private javax.swing.JLabel lblcertExpiry;
    private javax.swing.JLabel lblupdatedate;
    private javax.swing.JTextField txtCarMake;
    private javax.swing.JTextField txtCarModel;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountAvlCars;
    private javax.swing.JTextField txtCountUnAvlCars;
    private javax.swing.JTextField txtNumSeats;
    private javax.swing.JTextField txtRegDate;
    private javax.swing.JTextField txtSerialNum;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        for (CarDetails cd : history.getHistory()){
            
            Object[] row = new Object[8];
            row[0] = cd;
           // row[1] = cd.getCarMake();
            row[1] = cd.getCarModelNumber();
            row[2] = cd.getNumOfSeats();
            row[3] = cd.getCity();
            row[4] = cd.Availability();
            row[5] = cd.isExpiry();
            
            model.addRow(row);
            
        }
        
        
    }

    private void populateTableAvailable() {
         DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        for (CarDetails cd : history.getHistory()){
            
        
            if(cd.Availability() == true) {

            Object[] row = new Object[7];
          row[0] = cd;
             row[1] = cd.getCarModel();
            row[2] = cd.getCarModelNumber();
            row[3] = cd.getNumOfSeats();
            row[4] = cd.getCity();
            row[5] = cd.Availability();
            row[6] = cd.isExpiry();
            model.addRow(row);
            
            }
            
        }
    }
    
    
     private void populateTableFirstAvailable() {
         DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        
        for (CarDetails cd : history.getHistory()){
            
        
            if(cd.Availability() == true) {

            Object[] row = new Object[7];
           row[0] = cd;
             row[1] = cd.getCarModel();
            row[2] = cd.getCarModelNumber();
            row[3] = cd.getNumOfSeats();
            row[4] = cd.getCity();
            row[5] = cd.Availability();
            row[6] = cd.isExpiry();
            if (model.getRowCount() == 0) {
               model.addRow(row);
            
            }
            
        }
    }
  }

    private void SeatFilter() {
        
       
    
 }
}

    
    
    
     
    




