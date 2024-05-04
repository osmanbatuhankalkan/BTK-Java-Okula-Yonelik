import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public final class demo extends javax.swing.JFrame {

    DefaultTableModel model;
    //************************ BU KISIMDA ÇALIŞMA YAPTIM *****************************//
    public demo() {
        initComponents();
        populateTable();
    }

    public void populateTable(){
        //modeli temizleyecek bir operasyon yapacağız
        model = (DefaultTableModel)tblCities.getModel();
        model.setRowCount(0);//Sıfırlamış oluyoruz
        try {
            ArrayList<City> cities = getCities();
            for(City city : cities){
                Object[] row = {city.getId(),city.getName(),
                        city.getCountryCode(),city.getDistrict(),city.getPopulation()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(demo.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
    //************************ BU KISIMDA ÇALIŞMA YAPTIM *****************************// Aşşağıda da var onada bak !!!
    public ArrayList<City> getCities() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper =new DbHelper();
        Statement statement = null;
        ResultSet resultSet ;
        ArrayList<City> cities = null;

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from City");
            cities = new ArrayList<City>();
            while(resultSet.next()){
                cities.add(new City(
                        resultSet.getInt("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District"),
                        resultSet.getInt("Population")
                ));
            }

        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{

            statement.close();
            connection.close();
        }
        return cities;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbxNameCode = new javax.swing.JTextField();
        tbxCountryCode = new javax.swing.JTextField();
        tbxDistrict = new javax.swing.JTextField();
        tbxPopulation = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Id", "Name", "CountryCode", "District", "Population"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(0).setResizable(false);
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        txtSearch.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setText("Arama İfadesi :");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel1.setText("Şehir İsmi :");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel2.setText("Ülke Kodu :");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel3.setText("Bölge :");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel4.setText("Nüfus :");

        tbxNameCode.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N

        tbxCountryCode.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N

        tbxDistrict.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N

        tbxPopulation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnAdd.setText("EKLE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(tbxNameCode, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                        .addComponent(tbxCountryCode))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                        .addComponent(tbxDistrict)
                                                                        .addComponent(tbxPopulation))
                                                                .addGap(16, 16, 16)))))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSearch)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(tbxNameCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(tbxCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbxPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(btnAdd)
                                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    //************************ BU KISIMDA ÇALIŞMA YAPTIM *****************************//
    //keyReleased, bu kısmı toolbox'n Event bölümünden aktifleştirdik.Klavyeden girilen değerleri yakalamayı sağlar.
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey =txtSearch.getText();//Her aksiyonda textimizi okur. Artık arama ifadesine erişmiş olduk. Bunu şimdi filtre olarak göndermek gerekiyor.
        TableRowSorter<DefaultTableModel> tableRowSorter = //Nesne oluştu
                new TableRowSorter<DefaultTableModel>(model);//elimizdeki model nesnesini ona parametre olarak veriyoruz.Yani burada ilgili modeli vererek nesneyi oluşturduk
        tblCities.setRowSorter(tableRowSorter);//Burada ise şehirleri o table'ımıza bağlamış olduk.
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));//Ve filtre geçm,ş olduk.
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        Connection connection = null;//Connection' umuzu ve dbHelperımızı oluşturacak kodlar bunlar
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        try{
            connection = dbHelper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";//farklı kolonlar olsaydı sırayla içeri yazmamız gerekecekti fakat tamamını ekleyeceğimiz için gerek yok
            //? değerleri parametrik alacağımız için veriyoruz kaç tane alacaksak.
            statement = connection.prepareStatement(sql);//prepare hazırla demek birazdan gelecek olanlara hazırlıklı ol gibisnden
            statement.setString(1,tbxNameCode.getText());//Bunu arayüzdeki textbox kısmından al yaz diyoruz.
            statement.setString(2,tbxCountryCode.getText());//Bunu arayüzdeki textbox kısmından al yaz diyoruz.
            statement.setString(3,tbxDistrict.getText());//Bunu arayüzdeki textbox kısmından al yaz diyoruz.
            statement.setInt(4,Integer.valueOf(tbxPopulation.getText()));//Bunu arayüzdeki textbox kısmından al yaz diyoruz.
            int result = statement.executeUpdate();
            populateTable();//Data yenilendikten sonra tekrar çağırırsam otomatik güncellenmiş olacak
            //yukarıda populateTable 'ın metotunu güncelledik inceleyedebilirsin

        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);

        }finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(demo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //************************ BU KISIMDA ÇALIŞMA YAPTIM *****************************//


    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField tbxCountryCode;
    private javax.swing.JTextField tbxDistrict;
    private javax.swing.JTextField tbxNameCode;
    private javax.swing.JTextField tbxPopulation;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration                   
}
