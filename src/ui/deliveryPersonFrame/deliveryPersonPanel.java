/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.deliveryPersonFrame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.DeliveryPerson;
import model.EateryEnterprise;
import model.Food;
import model.Order;

/**
 *
 * @author ktkir
 */
public class deliveryPersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form deliveryPersonPanel
     */
    EateryEnterprise eatery;
    List<Order> currentOrders;
    int currentDeliveryPersonId;
    DeliveryPerson currentDeliveryPerson;
    public deliveryPersonPanel(EateryEnterprise eatery,int deliveryPersonId) {
        initComponents();
        this.eatery=eatery;
        this.currentDeliveryPersonId=deliveryPersonId;
         currentDeliveryPerson=eatery.getDeliveryBoyById(currentDeliveryPersonId);
    this.currentOrders=new ArrayList<>();
    if(currentDeliveryPerson.getActiveOrder()!=null)
    {
        this.currentOrders.add(currentDeliveryPerson.getActiveOrder());
    }
        
        
        
//        JOptionPane.showMessageDialog(this, "Delivery Person"+currentDeliveryPerson.getActiveOrder().getCity()+".."+currentDeliveryPerson.isAvailable());
        displayOrdersTable();
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
        ordersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deliverOrder = new javax.swing.JButton();
        customerMessage = new javax.swing.JTextField();
        labelContactCustomer = new javax.swing.JLabel();
        sendQuery = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Restaurant/Grocery  Id", "Customer Id", "Total Price", "Address", "Delivery Instructions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordersTable);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Employee");

        jLabel3.setBackground(new java.awt.Color(0, 153, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YOUR CURRENT ORDER");

        deliverOrder.setBackground(new java.awt.Color(102, 102, 102));
        deliverOrder.setForeground(new java.awt.Color(255, 255, 255));
        deliverOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delivery.png"))); // NOI18N
        deliverOrder.setText("DELIVER ORDER");
        deliverOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deliverOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deliverOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deliverOrderMouseExited(evt);
            }
        });
        deliverOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverOrderActionPerformed(evt);
            }
        });

        labelContactCustomer.setText("Contact Customer");

        sendQuery.setBackground(new java.awt.Color(102, 102, 102));
        sendQuery.setForeground(new java.awt.Color(255, 255, 255));
        sendQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send.png"))); // NOI18N
        sendQuery.setText("SEND");
        sendQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendQueryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendQueryMouseExited(evt);
            }
        });
        sendQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendQueryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1578, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(357, 357, 357)
                                .addComponent(labelContactCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sendQuery)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(deliverOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContactCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendQuery))
                .addGap(93, 93, 93)
                .addComponent(deliverOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliverOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverOrderActionPerformed
        // TODO add your handling code here:
    int col= 0;
        int row=ordersTable.getSelectedRow();


        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to deliver order!");
        } else {
            int orderId= Integer.parseInt(ordersTable.getModel().getValueAt(row, col).toString());
            eatery.deliveryBoyCompleteOrder(currentDeliveryPersonId, orderId);
              JOptionPane.showMessageDialog(this, "Congrats on completing your order!");
              this.currentOrders.remove(0);
              displayOrdersTable();
        }
    }//GEN-LAST:event_deliverOrderActionPerformed

    private void sendQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendQueryActionPerformed
        // TODO add your handling code here:
        //attach message to the current order so customer can see it when he logs in!

        int col= 0;
        int row=ordersTable.getSelectedRow();
        

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to send query to customer!");
        } else {
            int orderId= Integer.parseInt(ordersTable.getModel().getValueAt(row, col).toString());
            if(!customerMessage.getText().equals(""))
            {
           eatery.sendQueryToCustomer(customerMessage.getText(), currentDeliveryPersonId);
           JOptionPane.showMessageDialog(this, "Query sent to Customer!");
           displayOrdersTable();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter message, that you want to send to the customer!");
            }
    
        }
    }//GEN-LAST:event_sendQueryActionPerformed

    private void sendQueryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendQueryMouseEntered
        // TODO add your handling code here:
        sendQuery.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_sendQueryMouseEntered

    private void sendQueryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendQueryMouseExited
        // TODO add your handling code here:
         sendQuery.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_sendQueryMouseExited

    private void deliverOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliverOrderMouseEntered
        // TODO add your handling code here:
        deliverOrder.setBackground(new Color(255,204,0)); 
    }//GEN-LAST:event_deliverOrderMouseEntered

    private void deliverOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliverOrderMouseExited
        // TODO add your handling code here:
        deliverOrder.setBackground(new Color(102,102,102)); 
    }//GEN-LAST:event_deliverOrderMouseExited

public void displayOrdersTable(){

         ordersTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) ordersTable.getModel();
        tableModel.setRowCount(0);    
        if (currentOrders!=null) {
            for (int i = 0; i < currentOrders.size(); i++) {
                Order order=currentOrders.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = order.getOrderId();
                 if(order.getRestaurantId()==-1)
                {
                tableRow[1]= "GROCERY STORE BOSTON";
                tableRow[2] = order.getCustomerId();
                tableRow[3] = order.getTotalPrice();
                tableRow[4] = order.getDevlieryAddress();
                tableRow[5]= order.getDeliveryInstructions();
                tableModel.addRow(tableRow);
                }
                else
                {
                  tableRow[1]= order.getRestaurantId();
                tableRow[2] = order.getCustomerId();
                tableRow[3] = order.getTotalPrice();
                tableRow[4] = order.getDevlieryAddress();
                tableRow[5]= order.getDeliveryInstructions();
                tableModel.addRow(tableRow);
                }
                
             
            }
        }
         
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerMessage;
    private javax.swing.JButton deliverOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelContactCustomer;
    private javax.swing.JTable ordersTable;
    private javax.swing.JButton sendQuery;
    // End of variables declaration//GEN-END:variables
}
