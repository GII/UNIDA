/**
 * *****************************************************************************
 *
 * Copyright (C) 2013 Mytech Ingenieria Aplicada <http://www.mytechia.com>
 * Copyright (C) 2013 Victor Sonora <victor@vsonora.com>
 *
 * This file is part of UNIDA.
 *
 * UNIDA is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * UNIDA is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with UNIDA. If not, see <http://www.gnu.org/licenses/>.
 *
 *****************************************************************************
 */
package com.unida.tools.librarybasicgui.dialog;

import com.mytechia.commons.framework.exception.InternalErrorException;
import com.mytechia.commons.framework.modelaction.exception.InstanceNotFoundException;
import com.unida.library.device.IDevice;
import com.unida.library.device.ontology.ControlCommandMetadata;
import com.unida.library.device.ontology.ControlFunctionalityMetadata;
import com.unida.library.device.ontology.DeviceState;
import com.unida.library.manage.im.InMemoryUniDAInstantiationFacade;
import com.unida.library.operation.device.IDeviceOperationCallback;
import com.unida.library.operation.OperationFailures;
import com.unida.library.operation.OperationTicket;
import com.unida.tools.librarybasicgui.UNIDALibraryBasicGUI;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *  Dialog class that can send states (plural) request messages to an UniDA device. 
 *  That is, messages that ask for info for the current value of ALL the states 
 * one UniDA device has
 *  A states reply message is received, with the current value for every state of
 * the UniDA device. The value can be raw or an ontology identifier
 * 
 * @author victor
 */
public class DeviceStatesDialog extends javax.swing.JDialog
{

    private InMemoryUniDAInstantiationFacade instantiationFacade;
    private String deviceId;

    /**
     * Constructor: an object of this class must be initilized for a given UniDA
     * device
     * A first query message is sent, as no aditional parameters are needed in order
     * to do so
     */
    public DeviceStatesDialog(java.awt.Frame parent, boolean modal,
            InMemoryUniDAInstantiationFacade instantiationFacade, String deviceId)
    {
        
        super(parent, modal);
        
        initComponents();
        jTableDeviceStates.getColumnModel().getColumn(1).setPreferredWidth(350); 

        this.instantiationFacade = instantiationFacade;
        this.deviceId = deviceId;
        
        this.setTitle(this.getTitle() + ": " + deviceId);
        
        sendQueryDeviceStatesMsg();
    }

    
    
    /*
     *  An UniDA states request message is sent to the associated UniDA device
     */
    private void sendQueryDeviceStatesMsg()
    {
        try
        {
            IDevice device = instantiationFacade.getDeviceManageFacade().findById(deviceId);
            this.instantiationFacade.getDeviceOperationFacade().asyncQueryDeviceStates(device, new OpCback());
        } catch (InternalErrorException | InstanceNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jTextInfoExecution = new javax.swing.JTextField();
        jScrollPaneDeviceStates = new javax.swing.JScrollPane();
        jTableDeviceStates = new javax.swing.JTable();
        jButtonSendRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Device states");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Returned Ack:");

        jTextInfoExecution.setEditable(false);
        jTextInfoExecution.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextInfoExecution.setMinimumSize(new java.awt.Dimension(10, 39));

        jTableDeviceStates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "State ID", "Value ID", "Value"
            }
        ));
        jScrollPaneDeviceStates.setViewportView(jTableDeviceStates);

        jButtonSendRequest.setText("Send Request (again)");
        jButtonSendRequest.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSendRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDeviceStates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSendRequest)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextInfoExecution, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInfoExecution, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDeviceStates, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonSendRequest)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendRequestActionPerformed
        UNIDALibraryBasicGUI.cleanJTable(jTableDeviceStates);
        sendQueryDeviceStatesMsg();
    }//GEN-LAST:event_jButtonSendRequestActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSendRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPaneDeviceStates;
    private javax.swing.JTable jTableDeviceStates;
    private javax.swing.JTextField jTextInfoExecution;
    // End of variables declaration//GEN-END:variables

    
    /*
     *  Implementation of IDeviceOperationCallback
     *  The object will handle a states reply message, displaying the info several
     * states. For each state its identifier and current value is displayed
     */
    private class OpCback implements IDeviceOperationCallback
    {

        @Override
        public void notifyQueryDeviceStateResult(OperationTicket ticket, IDevice dev, DeviceState state)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void notifyQueryDeviceStatesResult(OperationTicket ticket, IDevice dev, Collection<DeviceState> states)
        {
            jTextInfoExecution.setText("¡yuju!");
            int stateRow = 0;
            for (DeviceState state : states)
            {
                jTableDeviceStates.getModel().setValueAt(state.getId().toString(), stateRow, 0);
                jTableDeviceStates.getModel().setValueAt(state.getValue().getValueID(), stateRow, 1);
                jTableDeviceStates.getModel().setValueAt(state.getValue().getValueRaw(), stateRow, 2);
                stateRow++;
            }
        }
        
        @Override
        public void notifyWriteDeviceStateResult(OperationTicket ticket, IDevice dev)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void notifySendCommandQueryStateResult(OperationTicket ticket, IDevice dev, 
            ControlFunctionalityMetadata func, ControlCommandMetadata cmd, Collection<String> params, Collection<DeviceState> states)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void notifyCommandExecution(OperationTicket ticket, IDevice dev, 
            ControlFunctionalityMetadata func, ControlCommandMetadata cmd)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void notifyOperationFailure(OperationTicket ticket, IDevice dev, OperationFailures failure, String failureDescription)
        {
            jTextInfoExecution.setText("¡qué mal!");
        }
    }
    
    
}
