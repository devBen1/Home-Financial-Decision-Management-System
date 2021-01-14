package javaapplication1;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class NewJFrame extends javax.swing.JFrame {
        double total, bs, hr, sf, fd, cl, bu, sv, tf, lb;

    public NewJFrame() {
        initComponents();
        setTitle("Home Finance Management System");
        setLocationRelativeTo(null);
        setResizable(false);
        
        CurrentDate();
    }
    
     public void CurrentDate(){
            Thread clock = new Thread(){
                public void run(){
                    for(;;){
                        Calendar cal = new GregorianCalendar();
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        date_menu.setText("Date:" +day+ "-" +(month+1)+ "-" + year);
                        
                        int hour = cal.get(Calendar.HOUR);
                        int min = cal.get(Calendar.MINUTE);
                        int sec = cal.get(Calendar.SECOND);
                        time_menu.setText("Time:" +hour+ ":" +(min)+ ":" + sec);
                        
                    try{
                            sleep(1000);
                        }catch(InterruptedException ex){
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            };
            clock.start();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        generate = new javax.swing.JButton();
        house_rent = new javax.swing.JRadioButton();
        clothing = new javax.swing.JRadioButton();
        feeding = new javax.swing.JRadioButton();
        school_fees = new javax.swing.JRadioButton();
        basic_utilities = new javax.swing.JRadioButton();
        clear = new javax.swing.JButton();
        light_bills = new javax.swing.JRadioButton();
        transport = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        basic_salary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        family_size = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        edit_menu = new javax.swing.JMenu();
        help_menu = new javax.swing.JMenu();
        faq = new javax.swing.JMenuItem();
        about_menu = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        date_menu = new javax.swing.JMenu();
        time_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 9, 9));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "select basic needs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia Ref", 3, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(241, 239, 239));
        jPanel2.setOpaque(false);

        generate.setBackground(new java.awt.Color(248, 7, 7));
        generate.setFont(new java.awt.Font("Futura Md BT", 1, 10)); // NOI18N
        generate.setForeground(new java.awt.Color(253, 248, 248));
        generate.setText("GENERATE");
        generate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        house_rent.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        house_rent.setForeground(new java.awt.Color(253, 251, 251));
        house_rent.setText("House Rent");
        house_rent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        house_rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                house_rentMouseClicked(evt);
            }
        });
        house_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                house_rentActionPerformed(evt);
            }
        });

        clothing.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        clothing.setForeground(new java.awt.Color(253, 251, 251));
        clothing.setText("Clothing");
        clothing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clothing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clothingMouseClicked(evt);
            }
        });

        feeding.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        feeding.setForeground(new java.awt.Color(253, 251, 251));
        feeding.setText("Feeding");
        feeding.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        feeding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedingMouseClicked(evt);
            }
        });
        feeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedingActionPerformed(evt);
            }
        });

        school_fees.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        school_fees.setForeground(new java.awt.Color(253, 251, 251));
        school_fees.setText("School Fees");
        school_fees.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        school_fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                school_feesMouseClicked(evt);
            }
        });
        school_fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                school_feesActionPerformed(evt);
            }
        });

        basic_utilities.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        basic_utilities.setForeground(new java.awt.Color(253, 251, 251));
        basic_utilities.setText("Others");
        basic_utilities.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        basic_utilities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basic_utilitiesMouseClicked(evt);
            }
        });
        basic_utilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basic_utilitiesActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(248, 7, 7));
        clear.setFont(new java.awt.Font("Futura Md BT", 1, 10)); // NOI18N
        clear.setForeground(new java.awt.Color(253, 248, 248));
        clear.setIcon(new javax.swing.ImageIcon("/home/millz/Documents/Project Work/Joseph/HomeFinanceDecisionManagementSystem/attachments/Actions-edit-clear-icon-1.png")); // NOI18N
        clear.setText("CLEAR");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        light_bills.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        light_bills.setForeground(new java.awt.Color(253, 251, 251));
        light_bills.setText("Light Bills");
        light_bills.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        light_bills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                light_billsMouseClicked(evt);
            }
        });
        light_bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                light_billsActionPerformed(evt);
            }
        });

        transport.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        transport.setForeground(new java.awt.Color(253, 251, 251));
        transport.setText("Transport");
        transport.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        transport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(basic_utilities, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(feeding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(house_rent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clothing, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(school_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(light_bills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(house_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(school_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothing, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feeding, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basic_utilities, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(light_bills, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 510, 440));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("  BASIC SALARY:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 50));

        basic_salary.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        basic_salary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        basic_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basic_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(basic_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 320, 50));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("          HOME FINANCIAL MANAGEMENT SYSTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 60));

        family_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        family_size.setToolTipText("");
        family_size.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        family_size.setOpaque(false);
        family_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                family_sizeActionPerformed(evt);
            }
        });
        getContentPane().add(family_size, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 320, 50));

        jLabel3.setForeground(new java.awt.Color(235, 8, 8));
        jLabel3.setText("FAMILY SIZE:");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 130, 50));

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        output.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "OUTPUT"));
        output.setOpaque(false);
        jScrollPane1.setViewportView(output);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 420, 430));

        jLabel4.setForeground(new java.awt.Color(10, 0, 0));
        jLabel4.setText("        Copyright 2018 All rights reserved - Home Finance Decision Management System");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 630, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/background.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 710));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setOpaque(false);

        file_menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        file_menu.setText("  File   ");

        exit.setIcon(new javax.swing.ImageIcon("/home/millz/Documents/Project Work/Joseph/HomeFinanceDecisionManagementSystem/attachments/delete1.png")); // NOI18N
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file_menu.add(exit);

        jMenuBar1.add(file_menu);

        edit_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit_menu.setText("  Edit  ");
        jMenuBar1.add(edit_menu);

        help_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        help_menu.setText("  Help  ");

        faq.setText("FAQ");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });
        help_menu.add(faq);

        jMenuBar1.add(help_menu);

        about_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        about_menu.setText("  About  ");

        about.setText("About Us");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        about_menu.add(about);

        jMenuBar1.add(about_menu);

        date_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_menu.setText("  Date  ");
        jMenuBar1.add(date_menu);

        time_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        time_menu.setText("  Time  ");
        jMenuBar1.add(time_menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
       //System.exit(0);
       
        total = (bs - (hr + sf + fd + cl + bu + lb + tf));
        String totalAll =  Double.toString(total);
        output.append("\n" + "\n"+ "Savings is: " + "#" + totalAll);
        JOptionPane.showMessageDialog(this, "Your salary: " + basic_salary.getText() + " savings: " + totalAll);
         basic_salary.setText(null);
        house_rent.setSelected(false);
        school_fees.setSelected(false);
        feeding.setSelected(false);
        clothing.setSelected(false);
        basic_utilities.setSelected(false);
        transport.setSelected(false);
        light_bills.setSelected(false);
        output.setText(" ");
        
    }//GEN-LAST:event_generateActionPerformed

    private void house_rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_house_rentMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

       try{
            if(family_size.getSelectedItem().equals("2")){
               if (house_rent.isSelected()){
            //house_rent
            hr = ((0.14) * (bs));
            String hrent =  Double.toString(hr);
           output.append("\n"+"14% was allocated to house rent and the amount is: "+"#" +hrent + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("3")){
              if (house_rent.isSelected()){
            //house_rent
            hr = ((0.14) * (bs));
            String hrent =  Double.toString(hr);
           output.append("\n"+"14% was allocated to house rent and the amount is: "+"#" +hrent + "\n");
            }}
            else if(family_size.getSelectedItem().equals("4")){
                if (house_rent.isSelected()){
            //house_rent
            hr = ((0.14) * (bs));
            String hrent =  Double.toString(hr);
           output.append("\n"+"14% was allocated to house rent and the amount is: "+"#" +hrent + "\n");
            } }else if(family_size.getSelectedItem().equals("5")){
                if (house_rent.isSelected()){
            //house_rent
            hr = ((0.14) * (bs));
            String hrent =  Double.toString(hr);
           output.append("\n"+"14% was allocated to house rent and the amount is: "+"#" +hrent + "\n");
            }} else if(family_size.getSelectedItem().equals("6")){
                if (house_rent.isSelected()){
            //house_rent
            hr = ((0.14) * (bs));
            String hrent =  Double.toString(hr);
           output.append("\n"+"14% was allocated to house rent and the amount is: "+"#" +hrent + "\n");
            }
         }
       }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
                
    }//GEN-LAST:event_house_rentMouseClicked

    private void clothingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clothingMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

         try{
            if(family_size.getSelectedItem().equals("2")){
               if(clothing.isSelected()){
            //clothing
            cl = ((0.23) * (bs));
            String  cloth =  Double.toString(cl);
           output.append("\n"+"23% was allocated to clothing and the amount is: "+"#" +cloth + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(clothing.isSelected()){
            //clothing
            cl = ((0.23) * (bs));
            String  cloth =  Double.toString(cl);
           output.append("\n"+"23% was allocated to clothing and the amount is: "+"#" +cloth + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("4")){
               if(clothing.isSelected()){
            //clothing
            cl = ((0.22) * (bs));
            String  cloth =  Double.toString(cl);
           output.append("\n"+"22% was allocated to clothing and the amount is: "+"#" +cloth + "\n");
        }  
            } else if(family_size.getSelectedItem().equals("5")){
                 if(clothing.isSelected()){
            //clothing
            cl = ((0.235) * (bs));
            String  cloth =  Double.toString(cl);
           output.append("\n"+"23.5% was allocated to clothing and the amount is: "+"#" +cloth + "\n");
        }
            } else if(family_size.getSelectedItem().equals("6")){
                 if(clothing.isSelected()){
            //clothing
            cl = ((0.225) * (bs));
            String  cloth =  Double.toString(cl);
           output.append("\n"+"22.5% was allocated to clothing and the amount is: "+"#" +cloth + "\n");
        }
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
        
       
    }//GEN-LAST:event_clothingMouseClicked

    private void school_feesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_school_feesMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

         try{
            if(family_size.getSelectedItem().equals("2")){
              
        if(school_fees.isSelected()){
            //school_fees
            sf = ((0.16) * (bs));
            String sfees =  Double.toString(sf);
            output.append("\n"+"16% was allocated to school fees and the amount is: "+"#" +sfees + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(school_fees.isSelected()){
            //school_fees
            sf = ((0.16) * (bs));
            String sfees =  Double.toString(sf);
            output.append("\n"+"16% was allocated to school fees and the amount is: "+"#" +sfees + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("4")){
                 if(school_fees.isSelected()){
            //school_fees
            sf = ((0.165) * (bs));
            String sfees =  Double.toString(sf);
            output.append("\n"+"16.5% was allocated to school fees and the amount is: "+"#" +sfees + "\n");

        }
            } else if(family_size.getSelectedItem().equals("5")){
                 if(school_fees.isSelected()){
            //school_fees
            sf = ((0.165) * (bs));
            String sfees =  Double.toString(sf);
            output.append("\n"+"16.5% was allocated to school fees and the amount is: "+"#" +sfees + "\n");

        }
            } else if(family_size.getSelectedItem().equals("6")){
                 if(school_fees.isSelected()){
            //school_fees
            sf = ((0.17) * (bs));
            String sfees =  Double.toString(sf);
            output.append("\n"+"17% was allocated to school fees and the amount is: "+"#" +sfees + "\n");

        }
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
        
    }//GEN-LAST:event_school_feesMouseClicked

    private void school_feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_school_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_school_feesActionPerformed

    private void feedingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedingMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

         try{
            if(family_size.getSelectedItem().equals("2")){
              
        if(feeding.isSelected()){
            //feeding
            fd = ((0.30) * (bs));
            String feed =  Double.toString(fd);
            output.append("\n"+"30% was allocated to feeding and the amount is: "+"#" +feed + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(feeding.isSelected()){
            //feeding
            fd = ((0.31) * (bs));
            String feed =  Double.toString(fd);
            output.append("\n"+"31% was allocated to feeding and the amount is: "+"#" +feed + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("4")){
                 if(feeding.isSelected()){
            //feeding
            fd = ((0.32) * (bs));
            String feed =  Double.toString(fd);
            output.append("\n"+"32% was allocated to feeding and the amount is: "+"#" +feed + "\n");

        }
            } else if(family_size.getSelectedItem().equals("5")){
                 if(feeding.isSelected()){
            //feeding
            fd = ((0.33) * (bs));
            String feed =  Double.toString(fd);
            output.append("\n"+"33% was allocated to feeding and the amount is: "+"#" +feed + "\n");

        }
            } else if(family_size.getSelectedItem().equals("6")){
                 if(feeding.isSelected()){
            //feeding
            fd = ((0.34) * (bs));
            String feed =  Double.toString(fd);
            output.append("\n"+"34% was allocated to feeding and the amount is: "+"#" +feed + "\n");

        }
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
        
    }//GEN-LAST:event_feedingMouseClicked

    private void feedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedingActionPerformed

    private void basic_utilitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basic_utilitiesMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

         try{
            if(family_size.getSelectedItem().equals("2")){
              if(basic_utilities.isSelected()){
            //basic_utilities
            bu = ((0.02) * (bs));
            String basutil =  Double.toString(bu);
           output.append("\n"+"2% was allocated to Others and the amount is: "+"#" +basutil + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(basic_utilities.isSelected()){
            //basic_utilities
            bu = ((0.025) * (bs));
            String basutil =  Double.toString(bu);
           output.append("\n"+"2.5% was allocated to Others and the amount is: "+"#" +basutil + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("4")){
                 if(basic_utilities.isSelected()){
            //basic_utilities
            bu = ((0.015) * (bs));
            String basutil =  Double.toString(bu);
           output.append("\n"+"1.5% was allocated to Others and the amount is: "+"#" +basutil + "\n");
        }
            } else if(family_size.getSelectedItem().equals("5")){
                 if(basic_utilities.isSelected()){
            //basic_utilities
            bu = ((0.01) * (bs));
            String basutil =  Double.toString(bu);
           output.append("\n"+"1% was allocated to Others and the amount is: "+"#" +basutil + "\n");
        }
            } else if(family_size.getSelectedItem().equals("6")){
                 if(basic_utilities.isSelected()){
            //basic_utilities
            bu = ((0.01) * (bs));
            String basutil =  Double.toString(bu);
           output.append("\n"+"1% was allocated to Others and the amount is: "+"#" +basutil + "\n");
        }
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
        
        
    }//GEN-LAST:event_basic_utilitiesMouseClicked

    private void basic_utilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basic_utilitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basic_utilitiesActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // Input Data
        basic_salary.setText(null);
        house_rent.setSelected(false);
        school_fees.setSelected(false);
        feeding.setSelected(false);
        clothing.setSelected(false);
        basic_utilities.setSelected(false);
        transport.setSelected(false);
        light_bills.setSelected(false);
        output.setText(" ");

    }//GEN-LAST:event_clearActionPerformed

    private void light_billsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_light_billsMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);

         try{
            if(family_size.getSelectedItem().equals("2")){
               if(light_bills.isSelected()){
            //light_bills
            lb = ((0.07) * (bs));
            String lbills =  Double.toString(lb);
            output.append("\n"+"7% was allocated to light bill and the amount is: "+"#" +lbills + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(light_bills.isSelected()){
            //light_bills
            lb = ((0.07) * (bs));
            String lbills =  Double.toString(lb);
            output.append("\n"+"7% was allocated to light bill and the amount is: "+"#" +lbills + "\n");

        }
            }
            else if(family_size.getSelectedItem().equals("4")){
                 if(light_bills.isSelected()){
            //light_bills
            lb = ((0.07) * (bs));
            String lbills =  Double.toString(lb);
            output.append("\n"+"7% was allocated to light bill and the amount is: "+"#" +lbills + "\n");

        }
            } else if(family_size.getSelectedItem().equals("5")){
                 if(light_bills.isSelected()){
            //light_bills
            lb = ((0.07) * (bs));
            String lbills =  Double.toString(lb);
            output.append("\n"+"7% was allocated to light bill and the amount is: "+"#" +lbills + "\n");

        }
            } else if(family_size.getSelectedItem().equals("6")){
              if(light_bills.isSelected()){
            //light_bills
            lb = ((0.07) * (bs));
            String lbills =  Double.toString(lb);
            output.append("\n"+"7% was allocated to light bill and the amount is: "+"#" +lbills + "\n");

        }   
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
        
       
    }//GEN-LAST:event_light_billsMouseClicked

    private void light_billsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_light_billsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_light_billsActionPerformed

    private void transportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportMouseClicked
        // TODO add your handling code here:
        String basal = basic_salary.getText();
        bs = Integer.parseInt(basal);
          try{
            if(family_size.getSelectedItem().equals("2")){
               if(transport.isSelected()){
            //transport
            tf = ((0.05) * (bs));
            String tfare =  Double.toString(tf);
            output.append("\n"+"5% was allocated to transport and the amount is: "+"#" +tfare + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("3")){
               if(transport.isSelected()){
            //transport
            tf = ((0.05) * (bs));
            String tfare =  Double.toString(tf);
            output.append("\n"+"5% was allocated to transport and the amount is: "+"#" +tfare + "\n");
        }
            }
            else if(family_size.getSelectedItem().equals("4")){
                 if(transport.isSelected()){
            //transport
            tf = ((0.045) * (bs));
            String tfare =  Double.toString(tf);
            output.append("\n"+"4.5% was allocated to transport and the amount is: "+"#" +tfare + "\n");
        }
            } else if(family_size.getSelectedItem().equals("5")){
                 if(transport.isSelected()){
            //transport
            tf = ((0.04) * (bs));
            String tfare =  Double.toString(tf);
            output.append("\n"+"4% was allocated to transport and the amount is: "+"#" +tfare + "\n");
        }
            } else if(family_size.getSelectedItem().equals("6")){
                 if(transport.isSelected()){
            //transport
            tf = ((0.035) * (bs));
            String tfare =  Double.toString(tf);
            output.append("\n"+"3.5% was allocated to transport and the amount is: "+"#" +tfare + "\n");
        }
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Invalid");
         }
       
    }//GEN-LAST:event_transportMouseClicked

    private void basic_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basic_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basic_salaryActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        // TODO add your handling code here:
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+"//home//millz//NetBeansProjects//Personnel_Information_Management_System//attachments//jesse.jpg");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_faqActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Developed by Joseph Enofe (08181722977) \nMat No:PSC1405991  \nHome Finance Management System", "ABOUT US",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutActionPerformed

    private void family_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_family_sizeActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_family_sizeActionPerformed

    private void house_rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_house_rentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_house_rentActionPerformed

    private JFrame frame;
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenu about_menu;
    private javax.swing.JTextField basic_salary;
    private javax.swing.JRadioButton basic_utilities;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton clothing;
    private javax.swing.JMenu date_menu;
    private javax.swing.JMenu edit_menu;
    private javax.swing.JMenuItem exit;
    private javax.swing.JComboBox<String> family_size;
    private javax.swing.JMenuItem faq;
    private javax.swing.JRadioButton feeding;
    private javax.swing.JMenu file_menu;
    private javax.swing.JButton generate;
    private javax.swing.JMenu help_menu;
    private javax.swing.JRadioButton house_rent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton light_bills;
    private javax.swing.JTextArea output;
    private javax.swing.JRadioButton school_fees;
    private javax.swing.JMenu time_menu;
    private javax.swing.JRadioButton transport;
    // End of variables declaration//GEN-END:variables
}
