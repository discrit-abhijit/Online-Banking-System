
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
/*
 
 * Document: Contains the Create account form information
 */


public class Loading extends javax.swing.JFrame implements Runnable {
Connection conn;
ResultSet rs;
PreparedStatement pst;
int s =0;
Thread th;
    /**
     * Creates new form Loading
     */
    public Loading() {
        super("Loading");
        initComponents();
        th=new Thread((Runnable)this);
    }
    
    public void setUpLoading(){
        setVisible(false);
        th.start();
    }
    
    public void run(){
        try{
            for(int i=0;i<=200;i++){
                s++;
                int m = Progressbar.getMaximum();
                int v = Progressbar.getValue();
                if(v<m){
                    Progressbar.setValue(Progressbar.getValue()+1);
                    
                }else{
                    i = 201;
                    setVisible(false);
                    MyPage ob = new MyPage();
                    ob.setVisible(true);
                }
            Thread.sleep(50);
            }
        }catch(Exception e){
            
        }
                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoadingPage = new javax.swing.JPanel();
        Loadingtxt = new javax.swing.JLabel();
        Progressbar = new javax.swing.JProgressBar();
        Loading = new javax.swing.JLabel();
        LogoLdP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoadingPage.setBackground(new java.awt.Color(255, 255, 255));
        LoadingPage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 21, 48), 3, true));

        Loadingtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Loadingtxt.setText("Loading....");

        Progressbar.setForeground(new java.awt.Color(36, 51, 97));
        Progressbar.setStringPainted(true);

        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/icon-swirl-big.png"))); // NOI18N

        LogoLdP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/banking logo (2).png"))); // NOI18N

        javax.swing.GroupLayout LoadingPageLayout = new javax.swing.GroupLayout(LoadingPage);
        LoadingPage.setLayout(LoadingPageLayout);
        LoadingPageLayout.setHorizontalGroup(
            LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingPageLayout.createSequentialGroup()
                .addGroup(LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoLdP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(LoadingPageLayout.createSequentialGroup()
                        .addGroup(LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoadingPageLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoadingPageLayout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(Loadingtxt)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(LoadingPageLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoadingPageLayout.setVerticalGroup(
            LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingPageLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(LogoLdP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Loadingtxt)
                .addGap(32, 32, 32)
                .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(513, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading;
    private javax.swing.JPanel LoadingPage;
    private javax.swing.JLabel Loadingtxt;
    private javax.swing.JLabel LogoLdP;
    private javax.swing.JProgressBar Progressbar;
    // End of variables declaration//GEN-END:variables

 
}