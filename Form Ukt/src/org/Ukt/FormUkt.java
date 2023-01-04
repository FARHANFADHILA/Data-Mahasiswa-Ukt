package org.Ukt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class FormUkt {
    private JTextField textnama;
    private JTextField textTanggallahir;
    private JTextField textUkt;
    private JTable tablenya;
    private JButton simpanButton;
    private JPanel Panelnya;

    public int no;

    private DefaultTableModel tableModel;
    private final OOPNYA Mahasiswa;


    public FormUkt() {
        this.Mahasiswa = new OOPNYA();
        this.Tableinit();
        this.Nourut();

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textnama.getText();
                LocalDate tanggallahir = LocalDate.parse(textTanggallahir.getText());
                long ukt = Long.parseLong(textUkt.getText());

                OOPNYA mhs = new OOPNYA(nama,tanggallahir,ukt);

                no = Integer.parseInt(Nourut());
                no++;
                tableModel.addRow(new Object[]{no,nama,tanggallahir,mhs.umur(),mhs.Jenisukt()});

            }
        });
    }
    public String Nourut(){
        int baris = tableModel.getRowCount();
        int no = 0;
        for(int i = 0; i< baris; i++){
            no = Integer.parseInt(String.valueOf(i +1 ));
        }return String.valueOf(no);
    }

    public JPanel getPanelnya() {
        return Panelnya;
    }
    private void Tableinit(){
        Object [] kolom = {"NO", "Tanggal Lahir", "Usia", "UKT", "JenisUkt"};
        tableModel = new DefaultTableModel(new Object[][]{}, kolom);
        tablenya.setModel(tableModel);
        tablenya.setAutoCreateRowSorter(true);
    }
}