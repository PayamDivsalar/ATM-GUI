import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maincode {

    public static void main(String[] args){
        Font niceFont  = new Font(Font.DIALOG_INPUT,  Font.BOLD|Font.ITALIC, 15);

        JFrame mainFrame = new JFrame("ATM");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(720, 500);

        //using cardlayout in  main panel for making the changing panel in the existing frame.
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        //making selecting language panel

        JPanel selectingLanguagePanel = new JPanel();
        selectingLanguagePanel.setLayout(null);
        selectingLanguagePanel.setBackground(Color.cyan);
        JLabel englishLanguageLable= new JLabel("Please choose the language");
        englishLanguageLable.setBounds(150,170,300,100);
        englishLanguageLable.setFont(niceFont);
        selectingLanguagePanel.add(englishLanguageLable);
        JLabel persianLanguageLable= new JLabel("زبان را انتخاب کنید");
        persianLanguageLable.setFont(niceFont);
        persianLanguageLable.setBounds(430,170,200,100);
        selectingLanguagePanel.add(persianLanguageLable);
        JButton persianLanguageButton = new JButton("فارسی");
        persianLanguageButton.setBounds(620,170,100,80);
        JButton englishLanguageButton = new JButton("English");
        englishLanguageButton.setBounds(2,170,100,80);
        selectingLanguagePanel.add(persianLanguageButton);
        selectingLanguagePanel.add(englishLanguageButton);

        //making entering password panel

        JPanel enteringPasswordPanel = new JPanel();
        enteringPasswordPanel.setLayout(null);
        enteringPasswordPanel.setBackground(Color.cyan);
        JLabel enteringPassswordLable= new JLabel("Please enter your password.");
        enteringPassswordLable.setFont(niceFont);
        enteringPassswordLable.setBounds(240,100,300,100);
        enteringPasswordPanel.add(enteringPassswordLable);
        JButton enteringPassswordButtton = new JButton("Accept");
        enteringPassswordButtton.setFont(niceFont);
        enteringPassswordButtton.setBounds(350,400,100,40);
        enteringPasswordPanel.add(enteringPassswordButtton);
        JTextField enteringPasswordTextArea = new JTextField();
        enteringPasswordTextArea.setBounds(250,200,200,50);
        enteringPasswordPanel.add(enteringPasswordTextArea);
        JButton cancelPassswordEnteringButtton = new JButton("cancel");
        cancelPassswordEnteringButtton.setFont(niceFont);
        cancelPassswordEnteringButtton.setBounds(220,400,100,40);
        enteringPasswordPanel.add(cancelPassswordEnteringButtton);


        //making function panel

        JPanel functionPanel = new JPanel();
        functionPanel.setLayout(null);
        functionPanel.setBackground(Color.cyan);
        JButton changingPasswordButton = new JButton("change password");
        changingPasswordButton.setBounds(500,100,200,40);
        functionPanel.add(changingPasswordButton);
        JButton cashWithdrawalButton = new JButton("cash withdrawal");
        cashWithdrawalButton.setBounds(2,100,200,40);
        functionPanel.add(cashWithdrawalButton);
        JButton depositButton = new JButton("deposit");
        depositButton.setBounds(500,200,200,40);
        functionPanel.add(depositButton);
        JButton bankStatementButton = new JButton("Bank statement");
        bankStatementButton.setBounds(2,200,200,40);
        functionPanel.add(bankStatementButton);
        JButton cancelFunctionButton = new JButton("cancel");
        cancelFunctionButton.setBounds(2,300,200,40);
        functionPanel.add(cancelFunctionButton);




        //making changing password panel.

        JPanel changingPasswordPanel = new JPanel();
        changingPasswordPanel.setLayout(null);
        changingPasswordPanel.setBackground(Color.cyan);
        JLabel changingPasswordLable= new JLabel("Please enter your new password.");
        changingPasswordLable.setFont(niceFont);
        changingPasswordLable.setBounds(240,100,300,100);
        changingPasswordPanel.add(changingPasswordLable);
        JButton acceptPasswordButton = new JButton("Accept");
        acceptPasswordButton.setFont(niceFont);
        acceptPasswordButton .setBounds(350,400,100,40);
        changingPasswordPanel.add(acceptPasswordButton );
        JButton cancelPasswordButton = new JButton("cancel");
        cancelPasswordButton.setFont(niceFont);
        cancelPasswordButton .setBounds(265,400,100,40);
        changingPasswordPanel.add(cancelPasswordButton );
        JTextField changingPasswordTextArea = new JTextField();
        changingPasswordTextArea.setBounds(250,200,200,50);
        changingPasswordPanel.add(changingPasswordTextArea);

        //making cashwithdrawal panel.

        JPanel cashWithdrawalPanel = new JPanel();
        cashWithdrawalPanel.setLayout(null);
        cashWithdrawalPanel.setBackground(Color.cyan);
        JButton fiftyKMoneyButton = new JButton("50000");
        fiftyKMoneyButton.setBounds(2,50,100,50);
        cashWithdrawalPanel.add(fiftyKMoneyButton);
        JButton oneHundredKMoneyButton = new JButton("100000");
        oneHundredKMoneyButton.setBounds(500,50,100,50);
        cashWithdrawalPanel.add(oneHundredKMoneyButton);
        JButton oneHundredFiftyKMoneyButton = new JButton("150000");
        oneHundredFiftyKMoneyButton.setBounds(2,150,100,50);
        cashWithdrawalPanel.add(oneHundredFiftyKMoneyButton);
        JButton twoHundredKMoneyButton = new JButton("200000");
        twoHundredKMoneyButton.setBounds(500,150,100,50);
        cashWithdrawalPanel.add(twoHundredKMoneyButton);
        JButton userCashInputButton = new JButton("Enter the amount of cash");
        userCashInputButton.setBounds(2,250,250,50);
        cashWithdrawalPanel.add(userCashInputButton);
        JButton cancelCashWithDrawalButton = new JButton("cancel");
        cancelCashWithDrawalButton.setBounds(500,250,100,50);
        cashWithdrawalPanel.add(cancelCashWithDrawalButton);

        //making cashWithdrawalUserInput panel.
        JPanel cashWithdrawalUserInputPanel = new JPanel();
        cashWithdrawalUserInputPanel.setLayout(null);
        cashWithdrawalUserInputPanel.setBackground(Color.cyan);
        JLabel cashWithdrawalUserInputLable= new JLabel("Please enter the amount of cash.");
        cashWithdrawalUserInputLable.setFont(niceFont);
        cashWithdrawalUserInputLable.setBounds(240,100,300,100);
        cashWithdrawalUserInputPanel.add(cashWithdrawalUserInputLable);
        JButton acceptcashWithdrawalUserInputButton = new JButton("Accept");
        acceptcashWithdrawalUserInputButton.setFont(niceFont);
        acceptcashWithdrawalUserInputButton .setBounds(350,400,100,40);
        cashWithdrawalUserInputPanel.add(acceptcashWithdrawalUserInputButton );
        JButton cancelcashWithdrawalUserInputButton = new JButton("cancel");
        cancelcashWithdrawalUserInputButton.setFont(niceFont);
        cancelcashWithdrawalUserInputButton .setBounds(265,400,100,40);
        cashWithdrawalUserInputPanel.add(cancelcashWithdrawalUserInputButton );
        JTextField cashWithdrawalUserInputTextArea = new JTextField();
        cashWithdrawalUserInputTextArea.setBounds(250,200,200,50);
        cashWithdrawalUserInputPanel.add(cashWithdrawalUserInputTextArea);

        //making depositeMoney panel.
        JPanel depositeMoneyPanel = new JPanel();
        depositeMoneyPanel.setLayout(null);
        depositeMoneyPanel.setBackground(Color.cyan);
        JLabel moneyAmountDepositeLable= new JLabel("Please enter amount of money.");
        moneyAmountDepositeLable.setFont(niceFont);
        moneyAmountDepositeLable.setBounds(240,50,300,100);
        depositeMoneyPanel.add(moneyAmountDepositeLable);
        JTextField moneyAmountDepositeTextField = new JTextField();
        moneyAmountDepositeTextField.setBounds(220,130,300,30);
        depositeMoneyPanel.add(moneyAmountDepositeTextField);
        JLabel depositeDestinationLable= new JLabel("Please enter destination bank number.");
        depositeDestinationLable.setFont(niceFont);
        depositeDestinationLable.setBounds(240,150,360,100);
        depositeMoneyPanel.add(depositeDestinationLable);
        JTextField depositeDestinationTextField = new JTextField();
        depositeDestinationTextField.setBounds(220,230,300,30);
        depositeMoneyPanel.add(depositeDestinationTextField);
        JButton acceptDepositeMoneyButtton = new JButton("Accept");
        acceptDepositeMoneyButtton.setFont(niceFont);
        acceptDepositeMoneyButtton.setBounds(350,400,100,40);
        depositeMoneyPanel.add(acceptDepositeMoneyButtton);
        JButton cancelDepositeMoneyButton = new JButton("cancel");
        cancelDepositeMoneyButton.setBounds(240,400,100,40);
        depositeMoneyPanel.add(cancelDepositeMoneyButton);

        //making back statement panel.
        JPanel bankStatementPanel = new JPanel();
        bankStatementPanel.setLayout(null);
        bankStatementPanel.setBackground(Color.cyan);
        JLabel bankStatementLable = new JLabel("your bank statement is 28427879235793249752932923");
        bankStatementLable.setFont(niceFont);
        bankStatementLable.setBounds(240,100,400,100);
        bankStatementPanel.add(bankStatementLable);
        JButton doneBankStatementButton = new JButton("Done");
        doneBankStatementButton.setFont(niceFont);
        doneBankStatementButton.setBounds(300,200,100,20);
        bankStatementPanel.add(doneBankStatementButton);


        //making function succeccfull panel.
        JPanel functionSuccessfullPanel = new JPanel();
        functionSuccessfullPanel.setLayout(null);
        functionSuccessfullPanel.setBackground(Color.cyan);
        JLabel functionSucceccfullLable= new JLabel("your function has done succecfully");
        functionSucceccfullLable.setFont(niceFont);
        functionSucceccfullLable.setBounds(100,100,400,100);
        functionSuccessfullPanel.add(functionSucceccfullLable);
        JButton backButton = new JButton("Back");
        backButton.setFont(niceFont);
        backButton .setBounds(350,400,100,40);
        functionSuccessfullPanel.add(backButton );

        //making persian panels.

        JPanel persianEnteringPasswordPanel = new JPanel();
        persianEnteringPasswordPanel.setLayout(null);
        persianEnteringPasswordPanel.setBackground(Color.cyan);
        JLabel persianEnteringPasswordLable= new JLabel("رمز خود را وارد کنید.");
        persianEnteringPasswordLable.setFont(niceFont);
        persianEnteringPasswordLable.setBounds(240,100,300,100);
        persianEnteringPasswordPanel.add(persianEnteringPasswordLable);
        JButton persianEnteringPasswordButtton = new JButton("تایید");
        persianEnteringPasswordButtton.setFont(niceFont);
        persianEnteringPasswordButtton.setBounds(350,400,100,40);
        persianEnteringPasswordPanel.add(persianEnteringPasswordButtton);
        JTextField persianEnteringPasswordTextArea = new JTextField();
        persianEnteringPasswordTextArea.setBounds(250,200,200,50);
        persianEnteringPasswordPanel.add(persianEnteringPasswordTextArea);
        JButton cancelPersianEnteringPasswordButtton = new JButton("لغو");
        cancelPersianEnteringPasswordButtton.setFont(niceFont);
        cancelPersianEnteringPasswordButtton.setBounds(220,400,100,40);
        persianEnteringPasswordPanel.add(cancelPersianEnteringPasswordButtton);


        //making persian function panel

        JPanel persianFunctionPanel = new JPanel();
        persianFunctionPanel.setLayout(null);
        persianFunctionPanel.setBackground(Color.cyan);
        JButton persianChangingPasswordButton = new JButton("تغییر رمز");
        persianChangingPasswordButton.setBounds(500,100,200,40);
        persianFunctionPanel.add(persianChangingPasswordButton);
        JButton persianCashWithdrawalButton = new JButton("دریافت وجه");
        persianCashWithdrawalButton.setBounds(2,100,200,40);
        persianFunctionPanel.add(persianCashWithdrawalButton);
        JButton persianDepositButton = new JButton("انتقال وجه");
        persianDepositButton.setBounds(500,200,200,40);
        persianFunctionPanel.add(persianDepositButton);
        JButton persianBankStatementButton = new JButton("موجودی");
        persianBankStatementButton.setBounds(2,200,200,40);
        persianFunctionPanel.add(persianBankStatementButton);
        JButton persianCancelFunctionButton = new JButton("لغو");
        persianCancelFunctionButton.setBounds(2,300,200,40);
        persianFunctionPanel.add(persianCancelFunctionButton);




        //making persian changing password panel.

        JPanel persianChangingPasswordPanel = new JPanel();
        persianChangingPasswordPanel.setLayout(null);
        persianChangingPasswordPanel.setBackground(Color.cyan);
        JLabel persianChangingPasswordLable= new JLabel("رمز جدید را وارد کنید.");
        persianChangingPasswordLable.setFont(niceFont);
        persianChangingPasswordLable.setBounds(240,100,300,100);
        persianChangingPasswordPanel.add(persianChangingPasswordLable);
        JButton persianAcceptPasswordButton = new JButton("تایید");
        persianAcceptPasswordButton.setFont(niceFont);
        persianAcceptPasswordButton .setBounds(350,400,100,40);
        persianChangingPasswordPanel.add(persianAcceptPasswordButton );
        JButton persianCancelPasswordButton = new JButton("لغو");
        persianCancelPasswordButton.setFont(niceFont);
        persianCancelPasswordButton .setBounds(265,400,100,40);
        persianChangingPasswordPanel.add(persianCancelPasswordButton );
        JTextField persianChangingPasswordTextArea = new JTextField();
        persianChangingPasswordTextArea.setBounds(250,200,200,50);
        persianChangingPasswordPanel.add(persianChangingPasswordTextArea);

        //making persian cashwithdrawal panel.

        JPanel persianCashWithdrawalPanel = new JPanel();
        persianCashWithdrawalPanel.setLayout(null);
        persianCashWithdrawalPanel.setBackground(Color.cyan);
        JButton persianFiftyKMoneyButton = new JButton("50000");
        persianFiftyKMoneyButton.setBounds(2,50,100,50);
        persianCashWithdrawalPanel.add(persianFiftyKMoneyButton);
        JButton persianOneHundredKMoneyButton = new JButton("100000");
        persianOneHundredKMoneyButton.setBounds(500,50,100,50);
        persianCashWithdrawalPanel.add(persianOneHundredKMoneyButton);
        JButton persianOneHundredFiftyKMoneyButton = new JButton("150000");
        persianOneHundredFiftyKMoneyButton.setBounds(2,150,100,50);
        persianCashWithdrawalPanel.add(persianOneHundredFiftyKMoneyButton);
        JButton persianTwoHundredKMoneyButton = new JButton("200000");
        persianTwoHundredKMoneyButton.setBounds(500,150,100,50);
        persianCashWithdrawalPanel.add(persianTwoHundredKMoneyButton);
        JButton persianUserCashInputButton = new JButton("مقدار وجه را وارد کنید");
        persianUserCashInputButton.setBounds(2,250,250,50);
        persianCashWithdrawalPanel.add(persianUserCashInputButton);
        JButton PersianCancelCashWithDrawalButton = new JButton("لغو");
        PersianCancelCashWithDrawalButton.setBounds(500,250,100,50);
        persianCashWithdrawalPanel.add(PersianCancelCashWithDrawalButton);

        //making persian cashWithdrawalUserInput panel.
        JPanel persianCashWithdrawalUserInputPanel = new JPanel();
        persianCashWithdrawalUserInputPanel.setLayout(null);
        persianCashWithdrawalUserInputPanel.setBackground(Color.cyan);
        JLabel persianCashWithdrawalUserInputLable= new JLabel("مفدار وجه را وارد کنید.");
        persianCashWithdrawalUserInputLable.setFont(niceFont);
        persianCashWithdrawalUserInputLable.setBounds(240,100,300,100);
        persianCashWithdrawalUserInputPanel.add(persianCashWithdrawalUserInputLable);
        JButton acceptpersianCashWithdrawalUserInputButton = new JButton("تایید");
        acceptpersianCashWithdrawalUserInputButton.setFont(niceFont);
        acceptpersianCashWithdrawalUserInputButton .setBounds(350,400,100,40);
        persianCashWithdrawalUserInputPanel.add(acceptpersianCashWithdrawalUserInputButton );
        JButton cancelpersianCashWithdrawalUserInputButton = new JButton("لغو");
        cancelpersianCashWithdrawalUserInputButton.setFont(niceFont);
        cancelpersianCashWithdrawalUserInputButton .setBounds(265,400,100,40);
        persianCashWithdrawalUserInputPanel.add(cancelpersianCashWithdrawalUserInputButton );
        JTextField persianCashWithdrawalUserInputTextArea = new JTextField();
        persianCashWithdrawalUserInputTextArea.setBounds(250,200,200,50);
        persianCashWithdrawalUserInputPanel.add(persianCashWithdrawalUserInputTextArea);

        //making persian depositeMoney panel.
        JPanel persianDepositeMoneyPanel = new JPanel();
        persianDepositeMoneyPanel.setLayout(null);
        persianDepositeMoneyPanel.setBackground(Color.cyan);
        JLabel moneyAmountpersianDepositeMoneyLable= new JLabel("مفدابول را وارد کنید.");
        moneyAmountpersianDepositeMoneyLable.setFont(niceFont);
        moneyAmountpersianDepositeMoneyLable.setBounds(240,50,300,100);
        persianDepositeMoneyPanel.add(moneyAmountpersianDepositeMoneyLable);
        JTextField moneyAmountpersianDepositeMoneyTextField = new JTextField();
        moneyAmountpersianDepositeMoneyTextField.setBounds(220,130,300,30);
        persianDepositeMoneyPanel.add(moneyAmountpersianDepositeMoneyTextField);
        JLabel persianDepositeMoneyDestinationLable= new JLabel("شماره کارت مقصد را وارد کنبد.");
        persianDepositeMoneyDestinationLable.setFont(niceFont);
        persianDepositeMoneyDestinationLable.setBounds(240,150,360,100);
        persianDepositeMoneyPanel.add(persianDepositeMoneyDestinationLable);
        JTextField persianDepositeMoneyDestinationTextField = new JTextField();
        persianDepositeMoneyDestinationTextField.setBounds(220,230,300,30);
        persianDepositeMoneyPanel.add(persianDepositeMoneyDestinationTextField);
        JButton acceptpersianDepositeMoneyButtton = new JButton("تایید");
        acceptpersianDepositeMoneyButtton.setFont(niceFont);
        acceptpersianDepositeMoneyButtton.setBounds(350,400,100,40);
        persianDepositeMoneyPanel.add(acceptpersianDepositeMoneyButtton);
        JButton cancelpersianDepositeMoneyButton = new JButton("لغو");
        cancelpersianDepositeMoneyButton.setBounds(240,400,100,40);
        persianDepositeMoneyPanel.add(cancelpersianDepositeMoneyButton);

        //making back statement panel.
        JPanel persianBankStatementPanel = new JPanel();
        persianBankStatementPanel.setLayout(null);
        persianBankStatementPanel.setBackground(Color.cyan);
        JLabel persianBankStatementLable = new JLabel("موجودی حساب شما ۱ریال");
        persianBankStatementLable.setFont(niceFont);
        persianBankStatementLable.setBounds(240,100,400,100);
        persianBankStatementPanel.add(persianBankStatementLable);
        JButton donepersianBankStatementButton = new JButton("تایید");
        donepersianBankStatementButton.setFont(niceFont);
        donepersianBankStatementButton.setBounds(300,200,100,20);
        persianBankStatementPanel.add(donepersianBankStatementButton);


        //making function succeccfull panel.
        JPanel persianFunctionSuccessfullPanel = new JPanel();
        persianFunctionSuccessfullPanel.setLayout(null);
        persianFunctionSuccessfullPanel.setBackground(Color.cyan);
        JLabel persianFunctionSuccessfullLable= new JLabel("عملیات با موفقیت انجام شد.");
        persianFunctionSuccessfullLable.setFont(niceFont);
        persianFunctionSuccessfullLable.setBounds(100,100,400,100);
        persianFunctionSuccessfullPanel.add(persianFunctionSuccessfullLable);
        JButton persianBackButton = new JButton("برگشت");
        persianBackButton.setFont(niceFont);
        persianBackButton .setBounds(350,400,100,40);
        persianFunctionSuccessfullPanel.add(persianBackButton );


        //adding panels to the main panel and set name for them for next usages.

        mainPanel.add(selectingLanguagePanel, "selecting language panel");
        mainPanel.add(enteringPasswordPanel, "entering password panel");
        mainPanel.add(functionPanel, "function panel");
        mainPanel.add(changingPasswordPanel, "changing password panel");
        mainPanel.add(functionSuccessfullPanel, "function successfull panel");
        mainPanel.add(cashWithdrawalPanel, "cashWithdrawal panel");
        mainPanel.add(cashWithdrawalUserInputPanel,"cashWithdrawalUserInput panel");
        mainPanel.add(depositeMoneyPanel,"deposite money panel");
        mainPanel.add(bankStatementPanel,"bank statement panel");
        mainPanel.add(persianEnteringPasswordPanel, "persian entering password panel");
        mainPanel.add(persianFunctionPanel, "persian function panel");
        mainPanel.add(persianChangingPasswordPanel, "persian changing password panel");
        mainPanel.add(persianFunctionSuccessfullPanel, "persian function successfull panel");
        mainPanel.add(persianCashWithdrawalPanel, "persian cashWithdrawal panel");
        mainPanel.add(persianCashWithdrawalUserInputPanel,"persian cashWithdrawalUserInput panel");
        mainPanel.add(persianDepositeMoneyPanel,"persian deposite money panel");
        mainPanel.add(persianBankStatementPanel,"persian bank statement panel");

        //making panel changing from language panel into password panel.

        englishLanguageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "entering password panel");
            }
        });

        persianLanguageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "persian entering password panel");
            }
        });

        //making panel changing from entering password panel into function panel.

        enteringPassswordButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = enteringPasswordTextArea.getText();

                if(!password.isEmpty()) cardLayout.show(mainPanel,"function panel");
                enteringPasswordTextArea.setText("");


            }
        });

        //making panel changing from entering password panel into function panel.

        persianEnteringPasswordButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = persianEnteringPasswordTextArea.getText();

                if(!password.isEmpty()) cardLayout.show(mainPanel,"persian function panel");
                persianEnteringPasswordTextArea.setText("");


            }
        });


        //making panel changing from entering password panel into first panel;

        cancelPassswordEnteringButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //making panel changing from function panel into changing password panel.

        changingPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"changing password panel");

            }
        });

        //making panel changing from function panel into first panel/

        cancelFunctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //making panel changing from changing password panel into function successfull panel.

        acceptPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String changedPassword = changingPasswordTextArea.getText();

                if(!changedPassword.isEmpty()) cardLayout.show(mainPanel,"function successfull panel");
                changingPasswordTextArea.setText("");
            }
        });

        //changing panel from changing password panel into first panel.
        cancelPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });


        //changing panel from function successfull panel into first panel.
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel to cashWithdrawal panel.

        cashWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"cashWithdrawal panel");

            }
        });

        //changing panel fromm cashWithdrawal panel to successfull panel.

        fiftyKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"function successfull panel");

            }
        });
        oneHundredKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"function successfull panel");

            }
        });
        twoHundredKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"cashWithdrawal panel");

            }
        });
        oneHundredFiftyKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"function successfull panel");

            }
        });

        userCashInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"cashWithdrawalUserInput panel");

            }
        });

        //changing panel from cashWithdrawal panel to first panel.

        cancelCashWithDrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel cashWithdrawalUserInput panel to successful panel.

        acceptcashWithdrawalUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cashMoneyInput = cashWithdrawalUserInputTextArea.getText();
                if(!cashMoneyInput.isEmpty()) cardLayout.show(mainPanel,"function successfull panel");
                cashWithdrawalUserInputTextArea.setText("");

            }
        });

        //changing panel from cashWithdrawalUserInput panel to first panel

        cancelcashWithdrawalUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel into deposite panel.
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"deposite money panel");

            }
        });

        //changing panel from deposit money panel into successfull panel.

        acceptDepositeMoneyButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String depositeDestination = depositeDestinationTextField.getText();
                String moneyAmountDeposite = moneyAmountDepositeTextField.getText();
                if(!depositeDestination.isEmpty() && !moneyAmountDeposite.isEmpty()) cardLayout.show(mainPanel,"function successfull panel");
                depositeDestinationTextField.setText("");
                moneyAmountDepositeTextField.setText("");
            }
        });

        //changing panel from deposite panel into first panel.
        cancelDepositeMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel into bank statement panel.
        bankStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"bank statement panel");

            }
        });

        //changing panel from bank statement panel into successfull panel.
        doneBankStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"function successfull panel");

            }
        });


       //now for persian buttons




        //making panel changing from entering password panel into first panel;

        cancelPersianEnteringPasswordButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //making panel changing from function panel into changing password panel.

        persianChangingPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian changing password panel");

            }
        });

        //making panel changing from function panel into first panel/

        persianCancelFunctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //making panel changing from changing password panel into function successfull panel.

        persianAcceptPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String changedPassword = persianChangingPasswordTextArea.getText();

                if(!changedPassword.isEmpty()) cardLayout.show(mainPanel,"persian function successfull panel");
                persianChangingPasswordTextArea.setText("");
            }
        });

        //changing panel from changing password panel into first panel.
        persianCancelPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });


        //changing panel from function successfull panel into first panel.
        persianBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel to cashWithdrawal panel.

        persianCashWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian cashWithdrawal panel");

            }
        });

        //changing panel fromm cashWithdrawal panel to successfull panel.

        persianFiftyKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });
        persianOneHundredKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });
        persianTwoHundredKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });
        persianOneHundredFiftyKMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });

        persianUserCashInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian cashWithdrawalUserInput panel");

            }
        });

        //changing panel from cashWithdrawal panel to first panel.

        PersianCancelCashWithDrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel cashWithdrawalUserInput panel to successful panel.

        acceptpersianCashWithdrawalUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cashMoneyInput = persianCashWithdrawalUserInputTextArea.getText();
                if(!cashMoneyInput.isEmpty()) cardLayout.show(mainPanel,"persian function successfull panel");
                persianCashWithdrawalUserInputTextArea.setText("");

            }
        });

        //changing panel from cashWithdrawalUserInput panel to first panel

        cancelpersianCashWithdrawalUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel into deposite panel.
        persianDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian deposite money panel");

            }
        });

        //changing panel from deposit money panel into successfull panel.

        acceptpersianCashWithdrawalUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String depositeDestination = persianDepositeMoneyDestinationTextField.getText();
                String moneyAmountDeposite = moneyAmountpersianDepositeMoneyTextField.getText();
                if(!depositeDestination.isEmpty() && !moneyAmountDeposite.isEmpty()) cardLayout.show(mainPanel,"persian function successfull panel");
                persianDepositeMoneyDestinationTextField.setText("");
                moneyAmountpersianDepositeMoneyTextField.setText("");
            }
        });

        //changing panel from deposite panel into first panel.
        cancelpersianDepositeMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"selecting language panel");

            }
        });

        //changing panel from function panel into bank statement panel.
        persianBankStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian bank statement panel");

            }
        });

        //changing panel from bank statement panel into successfull panel.
        donepersianBankStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });

        //changing panel from deposite panel to funcrion successfull panel.

        acceptDepositeMoneyButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel,"persian function successfull panel");

            }
        });

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
}



