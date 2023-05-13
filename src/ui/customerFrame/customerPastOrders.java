/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customerFrame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.EateryEnterprise;
import model.Food;
import model.Order;

/**
 *
 * @author ktkir
 */
public class customerPastOrders extends javax.swing.JPanel {

    /**
     * Creates new form customerPastOrders
     */
    EateryEnterprise eatery;
    Customer currentCustomer;
    List<Order> pastOrders;
    List<Food> orderedFood;
    public customerPastOrders(EateryEnterprise eatery,Customer currentCustomer) {
        initComponents();
        this.eatery=eatery;
        this.currentCustomer=currentCustomer;
        this.pastOrders=new ArrayList<>();
        this.pastOrders=currentCustomer.getPastOrders();
        populatePastOrdersTable();
        this.orderedFood=new ArrayList<>();
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
        tblCurrentOrders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewfood = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 204));

        tblCurrentOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Restaraunt/Grocery Id", "Delivery Person Id", "Total Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCurrentOrders);

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAST ORDERS");

        viewfood.setBackground(new java.awt.Color(102, 102, 102));
        viewfood.setForeground(new java.awt.Color(255, 255, 255));
        viewfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        viewfood.setText("VIEW ORDERED FOOD");
        viewfood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewfoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewfoodMouseExited(evt);
            }
        });
        viewfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfoodActionPerformed(evt);
            }
        });

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Name", "Price", "Quantity Placed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFood);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(522, 522, 522))
            .addGroup(layout.createSequentialGroup()
                .addGap(707, 707, 707)
                .addComponent(viewfood, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(viewfood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfoodActionPerformed
        // TODO add your handling code here:
             int col= 0;
        int row=tblCurrentOrders.getSelectedRow();
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
         int OrderId= Integer.parseInt(tblCurrentOrders.getModel().getValueAt(row, col).toString());
         Order order = eatery.getOrderWithOrderId(OrderId);
         orderedFood=order.getOrderedFoodList();
         if(orderedFood.size()>0)
         {
            populateFoodList();
         }
         
        }
    }//GEN-LAST:event_viewfoodActionPerformed

    private void viewfoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewfoodMouseEntered
        // TODO add your handling code here:
        viewfood.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_viewfoodMouseEntered

    private void viewfoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewfoodMouseExited
        // TODO add your handling code here:
        viewfood.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_viewfoodMouseExited

    
    private void populateFoodList() 
     {
    
         tblFood.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblFood.getModel();
        tableModel.setRowCount(0);
        if (orderedFood!=null) {
            for (int i = 0; i < orderedFood.size(); i++) {
                Food o = orderedFood.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = o.getName();
                tableRow[1]= o.getPrice();
                tableRow[2] = o.getQuantity();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    
    public void populatePastOrdersTable(){
        tblCurrentOrders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblCurrentOrders.getModel();
        tableModel.setRowCount(0);
        if (pastOrders!=null) {
            for (int i = 0; i < pastOrders.size(); i++) {
                Order ord = pastOrders.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = ord.getOrderId();
                if(ord.getRestaurantId()==-1)
                {
                   tableRow[1] = "GROCERY STORE, BOSTON";
                }
                else tableRow[1] = ord.getRestaurantId();
            
                if(ord.getDeliveryPersonId()==-1)
                {
                  tableRow[2]= "Not Assigned Yet";  
                }
                else tableRow[2]=ord.getDeliveryPersonId();
                tableRow[3]= ord.getTotalPrice();
                tableRow[4]= ord.getStatus();
                tableModel.addRow(tableRow);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCurrentOrders;
    private javax.swing.JTable tblFood;
    private javax.swing.JButton viewfood;
    // End of variables declaration//GEN-END:variables
}
