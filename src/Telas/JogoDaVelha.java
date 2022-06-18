/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;


import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author balta
 */
public class JogoDaVelha extends javax.swing.JFrame {
   
    
 
    public JogoDaVelha() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldPontuacaoO.setDisabledTextColor(Color.red);
        jTextFieldPontuacaox.setDisabledTextColor(Color.red);
        jTextFieldRodada.setDisabledTextColor(Color.red);
        jTextFieldPontuacaoO.setEnabled(false);
        jTextFieldPontuacaox.setEnabled(false);
        jTextFieldRodada.setEnabled(false);
        getContentPane().setBackground(Color.white);
        
    }
    public String resultado,transpostatxt,inversa,amaisb,amenosb,avzc,bina,oct,hexad;
    String nomex = "";
    String nomeo = "";
    String jogadorx = "";
    String jogadoro = "";
    public boolean joga=true; //Verivicar a vez do jogador
    public boolean jogb=true; //Verivicar a vez do jogador
    public int k=0,i=0;
    public int op;
    public int contpos;
    public String linha1,linha2, linha3, coluna1, coluna2, coluna3,diagonal1, diagonal2;
    public String [][] jogoDaVelha = new String [3][3];
    public String saida = "";
    public int[][] resultados = new int [2][5];
    public int rodada=0;
    public int pontuacaox=0;
    public int pontuacaoo=0;
    public String sd = "";
    int contx, conto, empate;
        int v;
        int [][]m = new int[2][5];
        int [][]b = new int[2][5];
        int [][]transposta = new int[5][2];
        int [][]d = new int[2][5];
        int [][]e = new int[2][5];
        int [][]f = new int[2][2];
        int n;
        int p=0;
        int j;
        int x=1;
        int soma=0;
        int save=0;
        int svoct=0;
        int salvar;
        int sv;
        int svhex;
        int y;
        int binario = 0;
        int octagonal = 0;
        int h = 0;
        int z = 1;
        int aux1;
    public void jogadorDaVez(){
        if(joga&&jogb){
            this.op=1;
            joga=false;
            jogb=true;
            jLabelVezDeJogo.setText("O");
            
        }else if(joga&&jogb==false){
            this.op=1;
            joga=false;
            jogb=true;
            jLabelVezDeJogo.setText("O"); 
        }else{
            this.op=2;
            joga=true;
            jogb=false;
            jLabelVezDeJogo.setText("X");   
        }
    }
    
   public void desativaBotao(){
       
        Btn1.setEnabled(false);
        Btn2.setEnabled(false);
        Btn3.setEnabled(false);
        Btn4.setEnabled(false);
        Btn5.setEnabled(false);
        Btn6.setEnabled(false);
        Btn7.setEnabled(false);
        Btn8.setEnabled(false);
        Btn9.setEnabled(false);
        }
   
   public void limpaBtn(){
            for(i=0;i<3;i++){
        for(k=0;k<3;k++){
            jogoDaVelha[i][k]="";
        }
        }
        }
        
    public void verificaPosicao(){
        contpos = 0;
        for(i=0;i<3;i++){
        for(k=0;k<3;k++){
            if(jogoDaVelha[i][k]=="X"||jogoDaVelha[i][k]=="O")
             contpos+=1;   
        }
        }
         }
         
         
   public void repeticaoJogo(){
    
       
    if(rodada<5)   {
    Btn1.setText("");
    Btn1.setEnabled(true);
    Btn2.setText("");
    Btn2.setEnabled(true);
    Btn3.setText("");
    Btn3.setEnabled(true);
    Btn4.setText("");
    Btn4.setEnabled(true);
    Btn5.setText("");
    Btn5.setEnabled(true);
    Btn6.setText("");
    Btn6.setEnabled(true);
    Btn7.setText("");
    Btn7.setEnabled(true);
    Btn8.setText("");
    Btn8.setEnabled(true);
    Btn9.setText("");
    Btn9.setEnabled(true);
    limpaBtn();
    jLabelVezDeJogo.setText("");
    joga=true;
    jogb=true;
    rodada=rodada+1;
    String rod = ""+rodada;
    jTextFieldRodada.setText(rod);
    if(linha1.equals("XXX")||linha2.equals("XXX")||linha3.equals("XXX")||coluna1.equals("XXX")||coluna2.equals("XXX")||coluna3.equals("XXX")||diagonal1.equals("XXX")||diagonal2.equals("XXX")){
      pontuacaox+=5;
      jTextFieldPontuacaox.setText(""+pontuacaox);
      resultados[0][rodada-1]=pontuacaox;
      resultados[1][rodada-1]=pontuacaoo;
      soma+=pontuacaoo+pontuacaox;
    }
    else if(linha1.equals("OOO")||linha2.equals("OOO")||linha3.equals("OOO")||coluna1.equals("OOO")||coluna2.equals("OOO")||coluna3.equals("OOO")||diagonal1.equals("OOO")||diagonal2.equals("OOO")){
      pontuacaoo+=5;
      jTextFieldPontuacaoO.setText(""+pontuacaoo);
      resultados[0][rodada-1]=pontuacaox;
      resultados[1][rodada-1]=pontuacaoo;
      soma+=pontuacaoo+pontuacaox;
        
    } else if(contpos==9){
     pontuacaox+=2;
      jTextFieldPontuacaox.setText(""+pontuacaox);
      pontuacaoo+=2;
      jTextFieldPontuacaoO.setText(""+pontuacaoo);
      resultados[0][rodada-1]=pontuacaox;
      resultados[1][rodada-1]=pontuacaoo;
      soma+=pontuacaoo+pontuacaox;
    }
    JOptionPane.showMessageDialog(null, saida);
    }
    if(rodada==5){
        resultado="Pontuação: \n X = [" + resultados[0][0] + "] [" + resultados[0][1] + "] [" + resultados[0][2] + "] [" + resultados[0][3] + "] [" + resultados[0][4] +"]"+"\n" +"O = [" + resultados[1][0] + "] [" + resultados[1][1] + "] [" + resultados[1][2] + "] [" + resultados[1][3] + "] [" + resultados[1][4]+"]\n";
        
        
        //obter o tamanho do numero binario
        salvar = soma;
       
        while(salvar > 1){
            salvar = salvar /2;
            x++; 
        }
        //obter o tamanho do octal
        save = soma;
        svoct = soma;
        while(save > 1){
            save = save /8;
            z++; 
        }
        //obter o tamanho do hexadecimal
        sv = soma;
        svhex = soma;
        while(sv > 1){
            sv = sv /16;
            h++;
        }
        
        
        inversa = "Inversa: \n";
        for(j=0; j<5; j++){
            for(i = 0; i < 2; i++){
                b[i][j] = resultados[i][j];
                
            }
         }
            for(j=0;j<5/2;j++){
                for(i=0;i<2;i++){
                    aux1 = b[i][j];
                    b[i][j] = b[i][4-j];
                    b[i][4-j] = aux1;
                }
            }
        for(j = 0; j < 5; j++){
            inversa+=" ["+b[0][j] +"] "; 
        }
        inversa+="\n";
        for(j = 0; j < 5; j++){
            inversa+=" ["+b[1][j] +"] "; 
        }
        
        transpostatxt="Transposta: \n";
        for(j = 0; j < 5; j++){
            for(i = 0; i < 2; i++){
                transposta[j][i] = resultados[i][j];
                
            }
        }
        for(j = 0; j < 2; j++){
            transpostatxt+=" ["+transposta[0][j] + "] "; 
        }
        transpostatxt+="\n";
        for(j = 0; j < 2; j++){
            transpostatxt+=" ["+transposta[1][j] +"] ";
        }
        transpostatxt+="\n";
        for(j = 0; j < 2; j++){
            transpostatxt+=" ["+transposta[2][j] +"] ";
        }
        transpostatxt+="\n";
        for(j = 0; j < 2; j++){
            transpostatxt+=" ["+transposta[3][j] +"] ";
        }
        transpostatxt+="\n";
        for(j = 0; j < 2; j++){
            transpostatxt+=" ["+transposta[4][j] +"] ";
        }
        
        amaisb= "A+B \n";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                d[i][j] = resultados[i][j] + b[i][j];
                
            }
        }
        for(j = 0; j < 5; j++){
            amaisb+=" ["+d[0][j] + "] "; 
        }
        amaisb+="\n";
        for(j = 0; j < 5; j++){
            amaisb+=" ["+d[1][j] +"] ";
        }
        
        amenosb="A-B \n";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                e[i][j] = resultados[i][j] - b[i][j];
                
            }
        }
        for(j = 0; j < 5; j++){
            amenosb+=" ["+e[0][j] + "] "; 
        }
        amenosb+="\n";
        for(j = 0; j < 5; j++){
            amenosb+=" ["+e[1][j] +"] ";
        }
        amenosb+="\n";
        avzc=   "A*C \n";
        f[0][0] = (resultados[0][0] * transposta[0][0]) + (resultados[0][1] * transposta[1][0])+ (resultados[0][2] * transposta[2][0]) + (resultados[0][3] * transposta[3][0]) + (resultados[0][4] * transposta[4][0]);
         f[0][1] = (resultados[0][0] * transposta[0][1]) + (resultados[0][1] * transposta[1][1])+ (resultados[0][2] * transposta[2][1]) + (resultados[0][3] * transposta[3][1]) + (resultados[0][4] * transposta[4][1]);
         f[1][0] = (resultados[1][0] * transposta[0][0]) + (resultados[1][1] * transposta[1][0])+ (resultados[1][2] * transposta[2][0]) + (resultados[1][3] * transposta[3][0]) + (resultados[1][4] * transposta[4][0]);
         f[1][1] = (resultados[1][0] * transposta[0][1]) + (resultados[1][1] * transposta[1][1])+ (resultados[1][2] * transposta[2][1]) + (resultados[1][3] * transposta[3][1]) + (resultados[1][4] * transposta[4][1]);
         for(j = 0; j < 2; j++){
            avzc+=" ["+f[0][j] + "] "; 
        }
         avzc+="\n";
         for(j = 0; j < 2; j++){
            avzc+=" ["+f[1][j] +"] ";
        }
        
        bina="";
        int []bin = new int[x];

        for(i = 0; i < x; i++){
            bin[i]= soma %2;
            soma = soma /2;   
        }
        y = 0;
        for(i=0; i < x; i++){
            binario += bin[i] * Math.pow(10,y);
            y++;
        }
        bina+= binario;
        oct= "";
        
        int []octa = new int[z];
        for(i = 0; i < z; i++){
            octa[i]= svoct %8;
            svoct = svoct /8; 
        }
        
        y = 0;
        for(i=0; i < z; i++){
            octagonal += octa[i] * Math.pow(10,y);
            y++;
        }
        oct+=octagonal;
        hexad= "";
        
        int []hexa = new int[h];
        int aux;
        String []hex = new String[h];
        for(i = 0; i < h; i++){
            hexa[i] = svhex %16;
            svhex = svhex /16;
        }
        for(i = 0; i < h/2; i++){
            aux = hexa[i];
            hexa[i] = hexa[1-i];
            hexa[1-i] = aux;
        }
        for(i = 0; i < h; i++){
        hex[i] = Integer.toString(hexa[i]);
        if(hexa[i] == 10){
            hex[i] = "A";
        }
        if(hexa[i] == 11){
            hex[i] = "B";
        }
        if(hexa[i] == 12){
            hex[i] = "C";
        }
        if(hexa[i] == 13){
            hex[i] = "D";
        }
        if(hexa[i] == 14){
            hex[i] = "E";
        }
        if(hexa[i] == 15){
            hex[i] = "F";
        }
        }
        

        for(j = 0; j < h; j++){
            hexad+= hex[j];
        }
        TelaMatrizes matrizes = new TelaMatrizes();

        matrizes.recebeAmaisb(""+amaisb);
        matrizes.recebeAmenosb(""+amenosb);
        matrizes.recebeAvzc(""+avzc);
        matrizes.recebeBinario(""+bina);
        matrizes.recebeHexa(""+hexad);
        matrizes.recebeInv(""+inversa);
        matrizes.recebeOcta(""+oct);
        matrizes.recebeRes(""+resultado);
        matrizes.recebeTra(""+transpostatxt);
        matrizes.setVisible(true);
        this.dispose();
        jTextFieldRodada.setText("");
        jTextFieldPontuacaox.setText("");
        jTextFieldPontuacaoO.setText("");
        rodada=0;
        pontuacaoo=0;
        pontuacaox=0;
    }
   }
   public void verificaVencedor(){
    linha1=jogoDaVelha[0][0]+jogoDaVelha[0][1]+jogoDaVelha[0][2];  
    linha2=jogoDaVelha[1][0]+jogoDaVelha[1][1]+jogoDaVelha[1][2];
    linha3=jogoDaVelha[2][0]+jogoDaVelha[2][1]+jogoDaVelha[2][2];
    
    coluna1=jogoDaVelha[0][0]+jogoDaVelha[1][0]+jogoDaVelha[2][0];  
    coluna2=jogoDaVelha[0][1]+jogoDaVelha[1][1]+jogoDaVelha[2][1];
    coluna3=jogoDaVelha[0][2]+jogoDaVelha[1][2]+jogoDaVelha[2][2];
    
    diagonal1=jogoDaVelha[0][0]+jogoDaVelha[1][1]+jogoDaVelha[2][2];  
    diagonal2=jogoDaVelha[0][2]+jogoDaVelha[1][1]+jogoDaVelha[2][0];
  
    
    if(linha1.equals("XXX")||linha2.equals("XXX")||linha3.equals("XXX")||coluna1.equals("XXX")||coluna2.equals("XXX")||coluna3.equals("XXX")||diagonal1.equals("XXX")||diagonal2.equals("XXX")){
       
        saida = "O jogador X ganhou";
        desativaBotao();
        repeticaoJogo();
        
    }
    else if(linha1.equals("OOO")||linha2.equals("OOO")||linha3.equals("OOO")||coluna1.equals("OOO")||coluna2.equals("OOO")||coluna3.equals("OOO")||diagonal1.equals("OOO")||diagonal2.equals("OOO")){
      
        saida = "O jogador O ganhou";
        desativaBotao();
        repeticaoJogo();
        
    } else if(contpos==9){
     
      saida = "Empatou";
      repeticaoJogo();
      
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

        jLabel1 = new javax.swing.JLabel();
        jLabelVezDeJogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeJogadorX = new javax.swing.JLabel();
        jTextFieldNomeJogadorO = new javax.swing.JLabel();
        jTextFieldPontuacaox = new javax.swing.JTextField();
        jTextFieldPontuacaoO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRodada = new javax.swing.JTextField();
        jButtonResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vez do jogador");

        jLabelVezDeJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelVezDeJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 233, 154));

        Btn1.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn1.setForeground(new java.awt.Color(255, 0, 51));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn2.setForeground(new java.awt.Color(255, 0, 51));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn3.setForeground(new java.awt.Color(255, 0, 51));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn4.setForeground(new java.awt.Color(255, 0, 51));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn5.setForeground(new java.awt.Color(255, 0, 51));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn6.setForeground(new java.awt.Color(255, 0, 51));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn7.setForeground(new java.awt.Color(255, 0, 51));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn8.setForeground(new java.awt.Color(255, 0, 51));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        Btn9.setForeground(new java.awt.Color(255, 0, 51));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Placar");

        jTextFieldNomeJogadorX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNomeJogadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextFieldNomeJogadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rodada");

        jTextFieldRodada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonResultados.setText("Resultados");
        jButtonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVezDeJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNomeJogadorX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeJogadorO, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPontuacaox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPontuacaoO, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldRodada))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonResultados)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVezDeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeJogadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPontuacaox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldRodada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeJogadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPontuacaoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        jogadorDaVez();
        if (op == 1) {
            Btn2.setText("X");
            jogoDaVelha[0][1] = "X";
        } else {
            Btn2.setText("O");
            jogoDaVelha[0][1] = "O";
        }
        Btn2.setEnabled(false);
        verificaPosicao();
        verificaVencedor();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
    jogadorDaVez();
        if(op==1){
            Btn5.setText("X");
            jogoDaVelha[1][1]="X";
        }else{
            Btn5.setText("O");
            jogoDaVelha[1][1]="O";
        }
        Btn5.setEnabled(false);
        verificaPosicao();
        verificaVencedor();  
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
    jogadorDaVez();
        if(op==1){
            Btn8.setText("X");
            jogoDaVelha[2][1]="X";
        }else{
            Btn8.setText("O");
            jogoDaVelha[2][1]="O";
        }
        Btn8.setEnabled(false);
        verificaPosicao();
        verificaVencedor();
    }//GEN-LAST:event_Btn8ActionPerformed

    private void jButtonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadosActionPerformed
    TelaMatrizes matrizes = new TelaMatrizes();
    
        matrizes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonResultadosActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
    jogadorDaVez();
        if(op==1){
            Btn1.setText("X");
            jogoDaVelha[0][0]="X";
        }else{
            Btn1.setText("O");
            jogoDaVelha[0][0]="O";
        }
        Btn1.setEnabled(false);
        verificaPosicao();
        verificaVencedor();
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
    jogadorDaVez();
        if(op==1){
            Btn3.setText("X");
            jogoDaVelha[0][2]="X";
        }else{
            Btn3.setText("O");
            jogoDaVelha[0][2]="O";
        }
        Btn3.setEnabled(false);
        verificaPosicao();
        verificaVencedor();
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
     jogadorDaVez();
        if(op==1){
            Btn4.setText("X");
            jogoDaVelha[1][0]="X";
        }else{
            Btn4.setText("O");
            jogoDaVelha[1][0]="O";
        }
        Btn4.setEnabled(false);
        verificaPosicao();
        verificaVencedor();        // TODO add your handling code here:
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
    jogadorDaVez();
        if(op==1){
            Btn6.setText("X");
            jogoDaVelha[1][2]="X";
        }else{
            Btn6.setText("O");
            jogoDaVelha[1][2]="O";
        }
        Btn6.setEnabled(false);
        verificaPosicao();
        verificaVencedor();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
     jogadorDaVez();
        if(op==1){
            Btn7.setText("X");
            jogoDaVelha[2][0]="X";
        }else{
            Btn7.setText("O");
            jogoDaVelha[2][0]="O";
        }
        Btn7.setEnabled(false);
        verificaPosicao();
        verificaVencedor(); 
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
     jogadorDaVez();
        if(op==1){
            Btn9.setText("X");
            jogoDaVelha[2][2]="X";
        }else{
            Btn9.setText("O");
            jogoDaVelha[2][2]="O";
        }
        Btn9.setEnabled(false);
        verificaPosicao();
        verificaVencedor(); 
    }//GEN-LAST:event_Btn9ActionPerformed
    public void recebex(String rx){
        jTextFieldNomeJogadorX.setText(rx);
        
    }
    public void recebeo(String ro){
        jTextFieldNomeJogadorO.setText(ro);
        
    }
    
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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton jButtonResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelVezDeJogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextFieldNomeJogadorO;
    private javax.swing.JLabel jTextFieldNomeJogadorX;
    private javax.swing.JTextField jTextFieldPontuacaoO;
    private javax.swing.JTextField jTextFieldPontuacaox;
    private javax.swing.JTextField jTextFieldRodada;
    // End of variables declaration//GEN-END:variables

   
}
