/*
Copyright 2008-2011 Gephi
Authors : Taras Klaskovsky <megaterik@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.ui.exporter.preview;

import org.gephi.io.exporter.preview.PNGExporter;
import org.gephi.lib.validation.ValidationClient;
import org.netbeans.validation.api.builtin.Validators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.netbeans.validation.api.ui.ValidationPanel;

public class UIExporterPNGPanel extends javax.swing.JPanel implements ValidationClient {

    void setup(PNGExporter exporter) {
        heightTextField.setText(Integer.toString(exporter.getHeight()));
        widthTextField.setText(Integer.toString(exporter.getWidth()));
        marginTextField.setText(Integer.toString(exporter.getMargin()));
        transparentBackgroundCheckbox.setSelected(exporter.isTransparentBackground());
    }

    void unsetup(PNGExporter exporter) {
        try {
            exporter.setWidth(Integer.parseInt(widthTextField.getText()));
            exporter.setHeight(Integer.parseInt(heightTextField.getText()));
            exporter.setMargin(Integer.parseInt(marginTextField.getText()));
            exporter.setTransparentBackground(transparentBackgroundCheckbox.isSelected());
        } catch (Exception ex) {
        }
    }

    public UIExporterPNGPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        widthTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        widthLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        labelWpx = new javax.swing.JLabel();
        labelHpx = new javax.swing.JLabel();
        labelMargin = new javax.swing.JLabel();
        marginTextField = new javax.swing.JTextField();
        labelMperc = new javax.swing.JLabel();
        transparentBackgroundCheckbox = new javax.swing.JCheckBox();

        widthTextField.setName("width"); // NOI18N

        heightTextField.setName("height"); // NOI18N

        widthLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterPNGPanel.class, "UIExporterPNGPanel.widthLabel.text")); // NOI18N

        heightLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterPNGPanel.class, "UIExporterPNGPanel.heightLabel.text")); // NOI18N

        labelWpx.setText("px");

        labelHpx.setText("px");

        labelMargin.setText("Margin:");

        marginTextField.setName("margin"); // NOI18N

        labelMperc.setText("% of width");

        transparentBackgroundCheckbox.setText("Transparent background");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(widthLabel)
                            .addGap(16, 16, 16)
                            .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelWpx)
                            .addGap(49, 49, 49))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelMargin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(marginTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(heightLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMperc)
                                .addComponent(labelHpx))))
                    .addComponent(transparentBackgroundCheckbox))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthLabel)
                    .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWpx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHpx))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMargin)
                    .addComponent(marginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMperc))
                .addGap(18, 18, 18)
                .addComponent(transparentBackgroundCheckbox)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel labelHpx;
    private javax.swing.JLabel labelMargin;
    private javax.swing.JLabel labelMperc;
    private javax.swing.JLabel labelWpx;
    private javax.swing.JTextField marginTextField;
    private javax.swing.JCheckBox transparentBackgroundCheckbox;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables

    public static ValidationPanel createValidationPanel(UIExporterPNGPanel innerPanel) {
        ValidationPanel validationPanel = new ValidationPanel();
        validationPanel.setInnerComponent(innerPanel);

        ValidationGroup group = validationPanel.getValidationGroup();
        innerPanel.validate(group);

        return validationPanel;
    }

    @Override
    public void validate(ValidationGroup group) {
        group.add(widthTextField, Validators.REQUIRE_NON_EMPTY_STRING, Validators.REQUIRE_VALID_INTEGER, Validators.numberRange(1, Integer.MAX_VALUE));
        group.add(heightTextField, Validators.REQUIRE_NON_EMPTY_STRING, Validators.REQUIRE_VALID_INTEGER, Validators.numberRange(1, Integer.MAX_VALUE));
        group.add(marginTextField, Validators.REQUIRE_NON_EMPTY_STRING, Validators.REQUIRE_VALID_INTEGER, Validators.numberRange(0, 100));
    }
}