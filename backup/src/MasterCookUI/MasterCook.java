/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterCookUI;

import java.io.*;
import java.text.DecimalFormat;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diogo
 */
public class MasterCook extends javax.swing.JFrame {

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Criacao de variaveis                                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    String MenuPrincipal, MenuVerDados, MenuInserirDados, MenuCriarNovaEdicao, MenuInsiraEdicao, 
                          MenuEdicoes, MenuConcorrentes, MenuPratos, MenuInsiraConcorrente, MenuInsiraPrato; 
            
    String dados, dados1, dados2, dados3, dados4, dados5, dados6, dados7;
    
    int conta = 1;
    int aux = 0;
    int menu = -1;
    
    static TreeMap<Integer, Edicao> edicoes;
    
    //construtor - inicializacao de strings que guardam os menus e criacao do treemap que guarda as edicoes
    public MasterCook() {
        try {
            initComponents();
            MenuPrincipal = ler("MenuPrincipal.txt");
            MenuVerDados = ler("MenuVerDados.txt");
            MenuInserirDados = ler("MenuInserirDados.txt");
            MenuCriarNovaEdicao = ler("MenuCriarNovaEdicao.txt");
            MenuInsiraEdicao = ler("InsiraEdicao.txt");
            MenuInsiraPrato = ler("InsiraPrato.txt");
            MenuEdicoes = ler("MenuEdicoes.txt");
            MenuConcorrentes = ler("MenuConcorrentes.txt");
            MenuPratos = ler("MenuPratos.txt");
            MenuInsiraConcorrente = ler("InsiraConcorrente.txt");
            edicoes = new TreeMap<Integer, Edicao>();
        } catch (IOException ex) {
            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        display = new java.awt.TextArea();
        bexecutar = new javax.swing.JButton();
        bsair = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bvoltar = new javax.swing.JButton();
        novosdados = new java.awt.TextField();
        bOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Master Cook");

        display.setBackground(new java.awt.Color(153, 153, 153));
        display.setEditable(false);
        display.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N

        bexecutar.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bexecutar.setText("Executar");
        bexecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexecutarActionPerformed(evt);
            }
        });

        bsair.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bsair.setText("Sair");
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Opcoes");

        b2.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bvoltar.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bvoltar.setText("Voltar");
        bvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvoltarActionPerformed(evt);
            }
        });

        novosdados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        novosdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novosdadosActionPerformed(evt);
            }
        });

        bOK.setFont(new java.awt.Font("Monaco", 1, 11)); // NOI18N
        bOK.setText("Ok");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bsair)
                                    .addComponent(bvoltar))
                                .addGap(681, 681, 681)
                                .addComponent(novosdados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bOK))
                            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bexecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1)
                                .addGap(18, 18, 18)
                                .addComponent(b2)
                                .addGap(18, 18, 18)
                                .addComponent(b3)))
                        .addGap(222, 222, 222))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bexecutar)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bvoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bsair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novosdados, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b1)
                                .addComponent(b2)
                                .addComponent(b3))
                            .addComponent(bOK))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Ler ficheiro                                                                                                                                   ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public static int numeroLinhas(String nome_ficheiro) throws IOException
    {
        FileReader fr = new FileReader(nome_ficheiro);
        BufferedReader bR = new BufferedReader(fr);

        int numero_linhas = 0;
        
        while(bR.readLine() != null)
            numero_linhas++;
        
        bR.close();
        return numero_linhas;
    }
    public static String ler(String nome_ficheiro) throws IOException //A FAZER - escreve nos treemaps o conteudo do ficheiro ao abrir o programa
    {
        FileReader fr = new FileReader(nome_ficheiro);
        BufferedReader br = new BufferedReader(fr);
        String texto = "";
        int numero_linhas = numeroLinhas(nome_ficheiro);
        int i;
        for(i = 0; i < numero_linhas; i++)
        {
            texto = texto + br.readLine() + "\n";
        }
        return texto;
    }
    public static String pFicheiro(String nome, String nome_ficheiro) throws IOException
    {
        /*
        String [] texto = abrirFicheiro(nome_ficheiro);
        int numerodelinhas = numeroLinhas(nome_ficheiro);
        
        FileReader fr = new FileReader(nome_ficheiro);
        BufferedReader bf = new BufferedReader(fr);
        
        String output = "";
        String dados = "";
        
        int i, j;
        int aux = 0;

        for( i = 0; i < numerodelinhas; i++)
        {
            if(i == 0)
            {
                output= output + texto[i] + "\n\n\n";
            }
            for( j = 0; j < texto[i].length(); j++)
            {
                if( aux == 1 && texto[i].charAt(j) != ';')
                    dados = dados + texto[i].charAt(j);
                else
                {
                    if(dados.equals(nome))
                    {
                        dados = "";
                        if(i != 0)
                        {
                            output= output + texto[i] + "\n\n";
                            break;
                        }
                    }
                    dados = "";
                }
                if( texto[i].charAt(j) == ';')
                    aux = 1;

            //if( texto[i].contains(nome))
            //    dados = dados + texto[i] + "\n";
            }
        }*/
        String output = "";
        return output;
    }
    
    
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Escreve Ficheiro                                                                                                                               ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     public static void escreverEdicoes() throws IOException{
        FileWriter fW = new FileWriter("Edicoes.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        PrintWriter ficheiro = new PrintWriter(bW);
        
        ficheiro.println("ANO | CIDADE | PESO CHEF"); //se o PESO CHEF for 0 entao a edição nao tem chef
        ficheiro.println(""); //para o notepad mostrar a linha de intrevalo... (se puser \n no final da instrução anterior nao mostra a linha em branco)
        for(Edicao e : edicoes.values())
            ficheiro.println(e.getAno()+";"+e.getCidade()+";"+e.getPesoChef());
        
        ficheiro.close();
    }
    
    public static void escreverConcorrentes() throws IOException{
        FileWriter fW = new FileWriter("Concorrentes.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        PrintWriter ficheiro = new PrintWriter(bW);
        
        ficheiro.println("NUMERO | NOME | IDADE | SEXO | EDIÇÃO");
        ficheiro.println("");
        for(Edicao e : edicoes.values()) //para cada edição de 'edicoes'
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente de 'edicao'
                ficheiro.println(c.getNumero()+";"+c.getNome()+";"+c.getIdade()+";"+c.getSexo()+";"+e.getAno());
        }
        
        ficheiro.close();
    }
    
    public static void escreverPratos() throws IOException{
        FileWriter fW = new FileWriter("Pratos.txt");
        BufferedWriter bW = new BufferedWriter(fW);
        PrintWriter ficheiro = new PrintWriter(bW);
        
        ficheiro.println("NUMERO DO CONCORRENTE | TIPO | REGIÃO | TEMPO | DUELO | NOTA");
        ficheiro.println("");
        
        for(Edicao e : edicoes.values()) //para cada edição de 'edicoes'
        {
            for(Concorrente c : e.getConcorrentes().values()) //para cada concorrente de 'edicao'
            {
                for(Prato p : c.getPratos().values()) //para cada prato de 'concorrente'
                {
                    ficheiro.print(c.getNumero()+";"+p.getTipo()+";"+p.getRegiao()+";"+p.getTempo()+";");
                    
                    if(p.isDuelo())
                        ficheiro.print("1;");
                    else
                        ficheiro.print("0;");
                    
                    DecimalFormat fmt = new DecimalFormat("#.00"); //força usar 2 casas decimais, mesmo que a última (ou as 2) sejam 0
                    ficheiro.println( fmt.format(p.getNota()) );
                }
            }
        }
        
        ficheiro.close();
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       TreeMap                                                                                                                               ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public int verificaPratoUnico(String nome) //ve se um prato com determinado nome e unico entre edicoes (retorna 1 se for unico ou se houver no maximo 1 prato destes mas de duelo)
    {
        int aux = 0;
        int aux1 = 0;
        for ( Edicao e : edicoes.values() )
        {
            aux = 0;
            for( Concorrente c : e.getConcorrentes().values())
            {
                for( Prato p : e.getConcorrentes().get(c.getNumero()).getPratos().values())
                {
                    if( p.getNome().equals(nome))
                    {
                        if( !p.isDuelo() )
                            return 0;
                        else
                        {
                            aux++;
                            aux1++;
                            if( aux > 1)
                                return 0;
                        }
                    }     
                }
            }
        }
        if(aux1 > 1)
            return 0;
        else
            return 1;
    }
    public boolean verificaPratos(Edicao e, Concorrente c) //ve se determinado concorrente ja tem 4 pratos
    {
        int aux = 0;
        for( Prato p : c.getPratos().values() )
            aux++;
        if( aux >= 4)
            return true;
        else
            return false;
    }
    public boolean verificaDuelo(Edicao e, String nome) //ve se o prato do duelo com determinado nome pertence a edicao do concorrente em causa (se sim e nao for deste entao este pode ficar com o mesmo)
    {
        for( Concorrente c : e.getConcorrentes().values())
        {
            for( Prato p : c.getPratos().values())
            {
                if( p.getNome().equals(nome))
                    if(p.isDuelo())
                        return true;    
            }
        }
        return false;
    }
    public boolean verificaPratoDuelo(Concorrente c) //ve se determinado concorrente ja tem prato do duelo
    {
        for( Prato p : c.getPratos().values())
        {
            if(p.isDuelo())
                return true;
        }
        return false;
    }
    public boolean contaSexo(Edicao e, String sexo) //ve se ja tem 4 concorrentes de determinado sexo
    {
        int aux = 0;
        for( Concorrente c : e.getConcorrentes().values())
            if( c.getSexo().equals(sexo))
                aux++;
        if( aux >= 4)
            return true;
        else
            return false;
    }
    public boolean verificaConcorrentes(Edicao e) //ve se ja tem 8 concorrentes em determinada edicao
    {
        int aux = 0;
        for( Concorrente c : e.getConcorrentes().values())
            aux++;
        if( aux >= 8)
            return true;
        else
            return false;
    }
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Interface                                                                                                                                      ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /*MENUS (alguns temporarios)
    1 - ver dados
    2 - inserir dados
    3 - criar nova edicao
    4 - consultar edicoes
    5 - consultar concorrentes
    6 - consultar pratos
    7 - inserir edicoes
    8 - inserir concorrentes
    9 - inserir pratos
    10 - menu edicoes
    11 - menu concorrentes
    12 - menu pratos
    */
    
    //metodo chamado com o pressionar do botao 1
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(menu == 2)
        {
            display.setText(" ");
            display.insert(MenuInsiraEdicao, 0);
            menu = 7;
        }
        if(menu == 1)
        {
            display.setText(" ");
            display.insert(MenuPrincipal, 0);//ler("MenuEdicoes.txt"), 0);
            menu = 4;
        }
        if(menu == 0)
        {
            display.setText(" ");
            display.insert(MenuVerDados, 0);
            menu = 1;
        }
    }//GEN-LAST:event_b1ActionPerformed

    //metodo chamado com o pressionar do botao executar
    private void bexecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexecutarActionPerformed
        if(menu == -1) //estado inicial                          
        {                                                       
            display.insert(MenuPrincipal, 0);                  
            menu = 0;                                          
        }
    }//GEN-LAST:event_bexecutarActionPerformed

    //metodo chamado com o pressionar do botao sair
    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bsairActionPerformed

    //metodo chamado com o pressionar do botao voltar
    private void bvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvoltarActionPerformed
        conta = 1;
        if(menu == 1 || menu == 2 || menu == 3)
        {
            display.setText(" ");
            display.insert(MenuPrincipal, 0);
            menu = 0;  
        }
        if(menu == 4 || menu == 5 || menu ==6)
        {
            display.setText(" ");
            display.insert(MenuVerDados, 0);
            menu = 1;
        }
        if(menu == 7 || menu == 8 || menu == 9)
        {
            display.setText(" ");
            display.insert(MenuInserirDados, 0);
            menu = 2;
        }
        if(menu == 10)
        {
            display.setText(" ");
            display.insert(MenuEdicoes, 0);
            menu = 4;
        }
        if(menu == 11)
        {
            display.setText(" ");
            display.insert(MenuConcorrentes, 0);
            menu = 5;
        }
        if(menu == 12)
        {
            display.setText(" ");
            display.insert(MenuPratos, 0);
            menu = 6;
        }
    }//GEN-LAST:event_bvoltarActionPerformed

    //metodo chamado com o pressionar do botao 2
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(menu == 2)
        {
            display.setText(" ");
            display.insert(MenuInsiraConcorrente, 0);
            menu = 8;
        }
        if(menu == 1)
        {
            display.setText(" ");
            display.insert(MenuConcorrentes, 0);
            menu = 5;
        }
        if(menu == 0)
        {
            display.setText(" ");
            display.insert(MenuInserirDados, 0);
            menu = 2;
        }
    }//GEN-LAST:event_b2ActionPerformed

    //metodo chamado com o pressionar do botao 3
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if(menu == 2)
        {
            display.setText(" ");
            display.insert(MenuInsiraPrato, 0);
            menu = 9;
        }
        if(menu == 1)
        {
            display.setText(" ");
            display.insert(MenuPratos, 0);
            menu = 6;
        }
        if(menu == 0)
        {
            display.setText(" ");
            display.insert(MenuCriarNovaEdicao, 0);
            try {
                Thread.sleep(3000);
                aux = 1;
            } catch (InterruptedException ex) {
                Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
            }
            display.setText(" ");
            display.insert(MenuInsiraEdicao, 0);
            menu = 3;
        }
    }//GEN-LAST:event_b3ActionPerformed

    //metodo do campo de dados
    private void novosdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novosdadosActionPerformed
        
    }//GEN-LAST:event_novosdadosActionPerformed

    //metodo chamado com o pressionar do botao OK
    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed

        if(menu == 4) //A FAZER - opcao consultar edicoes
        {
            try {
                display.setText(pFicheiro(dados, "Edicoes.txt"));
                menu = 10;
            } catch (IOException ex) {
                Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(menu == 5) //A FAZER - opcao consultar concorrentes
        {
            try {
                display.setText(pFicheiro(dados, "Concorrentes.txt"));
                menu = 11;
            } catch (IOException ex) {
                Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(menu == 6) //A FAZER - opcao consultar pratos
        {
            try {
                display.setText(pFicheiro(dados, "Pratos.txt"));
                menu = 12;
            } catch (IOException ex) {
                Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(menu == 7) //opcao inserir edicao
        {                
            if(conta == 3) // avaliacao do chefe
            {
                dados3 = novosdados.getText();
                
                double avaliacao_sim = 0;
                double avaliacao_nao = 0;
                if( dados3.toLowerCase().equals("s") )
                    avaliacao_sim = 1;
                if( dados3.toLowerCase().equals("n") )
                    avaliacao_nao = 1;
                
                if( avaliacao_sim == 1 || avaliacao_nao == 1 ) //se a resposta for valida
                {
                    display.insert(dados3, 505); //insere no display a frente de "Avaliacao do chefe (s/n): " a resposta submetida
                    try {Thread.sleep(500);} //sleep 500ms
                    catch (InterruptedException ex) {Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);} //excessao
                    Edicao edicao = new Edicao(dados2, Integer.parseInt(dados1), avaliacao_sim); //cria nova edicao com os parametros cidade, ano e avaliacao, respetivamente
                    edicoes.put(Integer.parseInt(dados1), edicao); //A ALTERAR - usar metodo addEdicao - adiciona ao treemap edicoes a edicao acabada de criar cuja chave e o seu ano
                    display.replaceRange("                          ", 451, 477); //apaga do display "Dados a da edicao a inserir: ", colocando a branco
                    display.replaceRange("Edicao inserida com sucesso!", 479, 600); //apaga do display "Avaliacao do chefe (s/n): ", colocando a confirmacao de sucesso
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta = 1; //coloca novamente a conta a 1 ja que chegou ao fim da criacao da nova edicao (para que a variavel conta possa ser usada novamente posteriormente)
                    menu = 0; //colocaa o menu atual como sendo o 0 (Menu Principal)
                    display.setText(" "); //apaga todo o display
                    display.insert(MenuPrincipal, 0);//ler("MenuPrincipal.txt"), 0); //coloca no display o Menu Principal
                    return;
                }
                else if( !(avaliacao_sim == 1 || avaliacao_nao == 1) ) //se nao for valida
                {
                    display.replaceRange("Opcao invalida!", 479, 600);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Avaliacao do chefe (s/n): ", 479, 600);
                }
            }            
            if(conta == 2) // cidade
            {
                dados2 = novosdados.getText(); //guarda em dados2 a cidade
                display.insert(dados2, 494);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta++;
                display.replaceRange("Avaliacao do chefe (s/n): ", 479, 600);
            }
            if(conta == 1) // ano
            {
                dados1 = novosdados.getText(); //guarda em dados 1 o ano
                if ( edicoes.containsKey(Integer.parseInt(dados1))) //se existe uma edicao no treemap com a chave guardada em dados1 (converte string para int primeiro) entao ja existe uma edicao do ano especificado
                {
                    display.replaceRange("Ja existe uma edicao com o ano introduzido!", 479, 600); //apaga "Ano da edicao: " e apresenta uma mensagem de erro e espera por um input valido
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Ano da edicao: ", 479, 600); // volta a apresentar "Ano da edicao: ", apagando a mensagem de erro
                }
                else //se nao existir
                {
                    display.insert(dados1, 494);
                    try 
                    {
                        Thread.sleep(500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta++; //incrementa o contador, aceitando o ano
                    display.replaceRange("Cidade: ", 479, 600); //apresenta o proximo input pretendido, apagando o anterior
                }
            }
        }
        if(menu == 8)
        {
            //Concorrente 1
            if(conta == 5) // idade
            {
                dados5 = novosdados.getText();
                display.insert(dados5, 505);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                Concorrente c = new Concorrente(dados4, Integer.parseInt(dados2), Integer.parseInt(dados5), dados3);
                edicoes.get(Integer.parseInt(dados1)).getConcorrentes().put(Integer.parseInt(dados2), c);
                display.replaceRange("                               ", 446, 477);
                display.replaceRange("Concorrente inserido com sucesso!", 497, 600);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta = 1;
                menu = 0;
                display.setText(" ");
                display.insert(MenuPrincipal, 0);//ler("MenuPrincipal.txt"), 0);
                return;
            }
            if(conta == 4) // nome
            {
                dados4 = novosdados.getText();
                display.insert(dados4, 505);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta++;
                display.replaceRange("Idade: ", 497, 600);
            }
            if(conta == 3) // sexo
            {
                dados3 = novosdados.getText();

                if( contaSexo(edicoes.get(Integer.parseInt(dados1)), dados3) )
                {
                    display.replaceRange("Ja existem quatro concorrentes do sexo " + dados3 + " nesta edicao!", 497, 600);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Sexo: ", 497, 600);
                }
                else
                {
                    display.insert(dados3, 545);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta++;
                    display.replaceRange("Nome: ", 497, 600);
                }
            }
            if(conta == 2) // numero
            {
                dados2 = novosdados.getText();
                if(!edicoes.get(Integer.parseInt(dados1)).getConcorrentes().keySet().contains(Integer.parseInt(dados2)))
                {
                    display.insert(dados2, 512);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta++;
                    display.replaceRange("Sexo: ", 497, 600);
                }
                else
                {
                    display.replaceRange("Ja existe um concorrente com o numero especificado!", 497, 600);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Numero: ", 497, 600);
                }
            }
            if(conta == 1) // Edicao
            {

                dados1 = novosdados.getText();
                if(edicoes.keySet().contains(Integer.parseInt(dados1)))
                {
                    if(verificaConcorrentes(edicoes.get(Integer.parseInt(dados1))))
                    {
                        display.replaceRange("Esta edicao ja tem oito concorrentes!", 497, 600);
                        try 
                        {
                            Thread.sleep(1500);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        display.replaceRange("Ano da edicao: ", 497, 600);
                    }
                    else
                    {
                        display.insert(dados1, 512);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        conta++;
                        display.replaceRange("Numero: ", 497, 600);
                    }
                }
                else
                {
                    display.replaceRange("Nao existe uma edicao com o ano especificado!", 497, 600);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Ano da edicao: ", 497, 600);
                }
            }
        }
        if(menu == 9) //FALTA TESTAR FUNCIONALIDADE DUELO
        {
            //Concorrente 1
            if(conta == 7) // duelo
            {
                dados7 = novosdados.getText();
                boolean duelo_sim = false;
                boolean duelo_nao = false;
                if( dados7.toLowerCase().equals("s") )
                    duelo_sim = true;
                else if( dados7.toLowerCase().equals("n") )
                    duelo_nao = true;
                
                if( duelo_sim )
                {
                    if( verificaPratoUnico(dados3) == 0 ) //se nao for unico (entao e de duelo e dependendo das condicoes abaixo o concorrente em questao pode ficar com o mesmo)
                    {
                        if( verificaDuelo(edicoes.get(Integer.parseInt(dados1)), dados3) ) //se for desta edicao
                        {
                            if( verificaPratoDuelo(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) // e pertencer a este concorrente apresenta mensagem de erro
                            {
                                display.replaceRange("Este concorrente ja tem o prato do duelo atribuido!", 479, 600);
                                try 
                                {
                                    Thread.sleep(1500);
                                } 
                                catch (InterruptedException ex) 
                                {
                                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                            }
                            else //se nao pertencer a este concorrente entao sim este pode ficar com o prato desde que seja o prato do duelo (e e de acordo com o metodo verificaPratoUnico)
                            {
                                Prato p = new Prato(dados3, dados4, dados5, Integer.parseInt(dados6), duelo_sim);
                                edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(dados3, p);
                                display.replaceRange("                        ", 451, 477);
                                display.replaceRange("Prato inserido com sucesso!", 477, 600);
                                try 
                                {
                                    Thread.sleep(2000);
                                } 
                                catch (InterruptedException ex) 
                                {
                                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                conta = 1;
                                menu = 0;
                                display.setText(" ");
                                display.insert(MenuPrincipal, 0);//ler("MenuPrincipal.txt"), 0);
                                return;
                            }
                        }
                        else //se nao for desta edicao entao apresenta mensagem de erro
                        {
                            display.replaceRange("Este prato ja existe como prato do duelo noutra edicao!", 479, 600);
                            try 
                            {
                                Thread.sleep(1500);
                            } 
                            catch (InterruptedException ex) 
                            {
                                Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                        }
                    }
                    else if( verificaPratoUnico(dados3) == 1) //se for unico entao pode ser atribuido a este concorrente
                    {
                        Prato p = new Prato(dados3, dados4, dados5, Integer.parseInt(dados6), duelo_sim);
                        edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(dados3, p);
                        display.replaceRange("                        ", 451, 477);
                        display.replaceRange("Prato inserido com sucesso!", 477, 600);
                        try 
                        {
                            Thread.sleep(2000);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        conta = 1;
                        menu = 0;
                        display.setText(" ");
                        display.insert(MenuPrincipal, 0);//ler("MenuPrincipal.txt"), 0);
                        return;
                    }
                }
                else if( duelo_nao ) //se nao for para ser prato do duelo entao so pode ser atribuido a este concorrente se for unico
                {
                    if( verificaPratoUnico(dados3) == 1) //se for unico entao o prato e inserido com sucesso
                    {
                        Prato p = new Prato(dados3, dados4, dados5, Integer.parseInt(dados6), duelo_sim);
                        edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)).addPrato(dados3, p);
                        display.replaceRange("                        ", 451, 477);
                        display.replaceRange("Prato inserido com sucesso!", 477, 600);
                        try 
                        {
                            Thread.sleep(2000);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        conta = 1;
                        menu = 0;
                        display.setText(" ");
                        display.insert(MenuPrincipal, 0);//ler("MenuPrincipal.txt"), 0);
                        return;
                    }
                    else if( verificaPratoUnico(dados3) == 0) //se nao for unico apresenta mensagem de erro
                    {
                        display.replaceRange("Este prato ja existe como prato do duelo noutra edicao!", 479, 600);
                        try 
                        {
                            Thread.sleep(1500);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                    }
                }
                else if( !(duelo_sim || duelo_nao) ) //se a opcao for invalida (input diferente de 's' ou 'n')
                {
                    display.replaceRange("Opcao invalida!", 479, 600);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Prato do duelo (s/n): ", 479, 600);
                }
            }
            if(conta == 6) // tempo de execucao
            {
                dados6 = novosdados.getText();
                display.insert(dados6, 545);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta++;
                display.replaceRange("Prato do duelo (s/n): ", 479, 600);
            }
            if(conta == 5) // regiao
            {
                dados5 = novosdados.getText();
                display.insert(dados5, 545);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta++;
                display.replaceRange("Tempo de execucao: ", 479, 600);
            }
            if(conta == 4) // tipo
            {
                dados4 = novosdados.getText();
                display.insert(dados4, 545);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta++;
                display.replaceRange("Regiao: ", 479, 600);
            }
            if(conta == 3) // nome do prato
            {

                dados3 = novosdados.getText();

                if(verificaPratoUnico(dados3) == 0)
                {
                    display.replaceRange("Este prato ja pertence a uma edicao!", 479, 600);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Nome do prato: ", 479, 600);
                }
                else
                {
                    display.insert(dados3, 545);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta++;
                    display.replaceRange("Tipo: ", 479, 600);
                }
            }
            if(conta == 2) // numero
            {
                dados2 = novosdados.getText();
                if(edicoes.get(Integer.parseInt(dados1)).getConcorrentes().keySet().contains(Integer.parseInt(dados2))) //se existe um concorrente com este numero nesta edicao
                {
                    if(verificaPratos(edicoes.get(Integer.parseInt(dados1)), edicoes.get(Integer.parseInt(dados1)).getConcorrentes().get(Integer.parseInt(dados2)))) //se o concorrente ja tiver 4 pratos
                    {
                        display.replaceRange("Este concorrente ja tem todos os pratos inseridos!", 479, 600); //apresenta mensagem de erro e espera por um input valido
                        try 
                        {
                            Thread.sleep(1500);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        display.replaceRange("Numero: ", 479, 600);
                    }
                    else //se tem menos de 4 pratos entao por enquanto pode ser atribuido e continua a pedir informacao, incrementando conta
                    {
                        display.insert(dados2, 545);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        conta++;
                        display.replaceRange("Nome do prato: ", 479, 600);
                    }
                }
                else //se nao existe entao apresenta mensagem de erro e espera por um input valido
                {
                    display.replaceRange("Nao existe um concorrente com o numero especificado!", 479, 600);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Numero: ", 479, 600);
                }
            }
            if(conta == 1) // Edicao
            {

                dados1 = novosdados.getText();
                if(edicoes.containsKey(Integer.parseInt(dados1))) //verifica se existe uma edicao do ano especificado
                {
                    display.insert(dados1, 494);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conta++;
                    display.replaceRange("Numero: ", 479, 600);
                }
                else //se nao existir entao apresenta mensagem de erro e espera por um input valido
                {
                    display.replaceRange("Nao existe uma edicao com o ano especificado!", 479, 550);
                    try 
                    {
                        Thread.sleep(1500);
                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(MasterCook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    display.replaceRange("Ano da edicao: ", 479, 600);
                }
            }
    }//GEN-LAST:event_bOKActionPerformed
}
    
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Main                                                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterCook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterCook().setVisible(true);
            }
        });
    }

    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    ;                       Declaracao de variaveis da interface                                                                                                           ;
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton bOK;
    private javax.swing.JButton bexecutar;
    private javax.swing.JButton bsair;
    private javax.swing.JButton bvoltar;
    public static java.awt.TextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.TextField novosdados;
    // End of variables declaration//GEN-END:variables
}
