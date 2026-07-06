import java.util.Scanner;

public class EDahabSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Xogta bilowga ah
        String pinSaxAh = "0000";
        double hanti = 155.00; // Haraaga bilowga ah

        System.out.println("=== Ku soo dhawaada eDahab ===");
        System.out.print("Fadlan geli PIN-kaaga: ");
        String pinLaGaliyay = input.next();

        if (pinLaGaliyay.equals(pinSaxAh)) {
            System.out.println("\n--- LOGIN SUCCESSFUL ---\n");

            // Main Menu
            System.out.println("====== eDahab Main Menu ======");
            System.out.println("1. Xisaabtaada (My Account)");
            System.out.println("2. U Wareeji (Transfer Money)");
            System.out.println("3. Kaarka Hadalka (Airtime)");
            System.out.println("4. Ku Iibso (Buy/Pay)");
            System.out.println("5. Lacag la Bixid (Cash Withdrawal)");
            System.out.println("6. Dahabshiil Akoon (Bank Account)");
            System.out.print("Dooro nambarka aad rabto (1-6): ");

            int doorasho = input.nextInt();
            System.out.println("--------------------------------");

            switch (doorasho) {

                case 1: // 1. Xisaabtaada
                    System.out.println("=== XISAABTAADA ===");
                    System.out.println("Haraagaaga hadda waa: $" + hanti);
                    System.out.println("1. Ka bax");
                    break;

                case 2: // 2. U Wareeji
                    System.out.println("=== U WAREEJI LACAG ===");
                    System.out.print("Geli nambarka qaataha: ");
                    String nambar = input.next();
                    System.out.print("Geli lacagta ($): ");
                    double lacagWareejin = input.nextDouble();

                    if (lacagWareejin <= hanti) {
                        System.out.println("\nMa hubtaa inaad $" + lacagWareejin + " u wareejiso " + nambar + "?");
                        System.out.println("1. Haa\n2. Maya");
                        System.out.print("Dooro: ");
                        int hubi = input.nextInt();
                        if (hubi == 1) {
                            hanti -= lacagWareejin; // Lacagta ayaa laga goynayaa hantida
                            System.out.println("Gudbiye: Waxaad $" + lacagWareejin + " u wareejisay " + nambar);
                            System.out.println("Haraagaaga cusub waa: $" + hanti);
                        } else {
                            System.out.println("Waa la baajiyay wareejintii.");
                        }
                    } else {
                        System.out.println("Waan ka xunnahay, haraagaaga kuuma ogola.");
                    }
                    break;

                case 3: // 3. Kaarka Hadalka
                    System.out.println("=== KAARKA HADALKA ===");
                    System.out.println("1. Ku shub nambarkaaga");
                    System.out.println("2. Ku shub nambar kale");
                    System.out.print("Dooro: ");
                    int airtimeOption = input.nextInt();

                    if (airtimeOption == 1) {
                        System.out.print("Geli lacagta ($): ");
                        double kuShubo = input.nextDouble();
                        System.out.println("Waxaad $" + kuShubo + " ku shubatay nambarkaaga dhexdiisa.");
                    } else if (airtimeOption == 2) {
                        System.out.print("Geli nambarka kale: ");
                        String nambarKale = input.next();
                        System.out.print("Geli lacagta ($): ");
                        double kuShuboKale = input.nextDouble();
                        System.out.println("Waxaad $" + kuShuboKale + " ugu shubtay nambarka: " + nambarKale);
                    } else {
                        System.out.println("Dooro khaldan.");
                    }
                    break;

                case 4: // 4. Ku Iibso
                    System.out.println("=== KU IIBSO (BUY/PAY) ===");
                    System.out.print("Geli Aqoonsiga Ganacsiga (Merchant ID): ");
                    String merchantID = input.next();
                    System.out.print("Geli Lacagta ($): ");
                    double lacagIibsi = input.nextDouble();
                    System.out.println("Waxaad $" + lacagIibsi + " siisay ganacsade ID-giisu yahay " + merchantID);
                    break;

                case 5: // 5. Lacag la Bixid
                    System.out.println("=== LACAG LA BIXID ===");
                    System.out.print("Geli Aqoonsiga Wakiilka (Agent ID): ");
                    String agentID = input.next();
                    System.out.print("Geli Lacagta aad bixinayso ($): ");
                    double lacagBixid = input.nextDouble();
                    System.out.println("Codsi ayaa loo diray Wakiilka " + agentID + ". Fadlan ka qaado $" + lacagBixid);
                    break;

                case 6: // 6. Dahabshiil Akoon
                    System.out.println("=== DAHABSHIIL BANK ===");
                    System.out.println("1. Ka soo wareeji Bank -> eDahab");
                    System.out.println("2. Ku wareeji eDahab -> Bank");
                    System.out.print("Dooro: ");
                    int bankOption = input.nextInt();

                    if (bankOption == 1) {
                        System.out.print("Geli lacagta aad soo xaraynayso ($): ");
                        double bankToWallet = input.nextDouble();
                        System.out.println("Waxaad Bank-ga ka soo qaadatay $" + bankToWallet);
                    } else if (bankOption == 2) {
                        System.out.print("Geli lacagta aad Bank-ga u dirayso ($): ");
                        double walletToBank = input.nextDouble();
                        System.out.println("Waxaad Bank-ga u dirtay $" + walletToBank);
                    } else {
                        System.out.println("Doorasho khaldan.");
                    }
                    break;

                default:
                    System.out.println("Nambar khaldan ayaad riixday!");
                    break;
            }

        } else {
            System.out.println("\nWaan ka xunnahay, PIN-kaaga waa khaldan yahay!");
        }

        input.close();



        class SomtelUSSDSystem {

            // Xogta rasmiga ah ee Macmiilka (Database-ka Nidaamka)
            private static String customerName = "Mohamed";
            private static String myNumber = "0614151029";
            private static double balanceDollar = 15000.0;       // Lacagta E-Dahab-ka
            private static double balanceShilling = 500000.0;  // Shilin Soomaali
            private static double airtimeBalance = 100.0;       // Kaarka hadalka Somtel
            private static double bankBalanceDollar = 600000;   // Lacagta dhex taala Dahabshiil Bank
            private static String pinCode = "1234";

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("=== WELCOME TO SOMTEL / E-DAHAB USSD ===");
                System.out.print("Fadlan geli PIN-kaaga si aad u bilowdo: ");
                String enteredPin = input.next();



                if (!enteredPin.equals(pinCode)) {
                    System.out.println("\n[KHALAD]: PIN-kaaga waa khaldan yahay! Nidaamka waa la xiray.");
                    input.close();
                    return;
                }


                System.out.println("\n--- E-DAHAB MAIN MENU ---");
                System.out.println("1. Xisaabtaada (Balance)");
                System.out.println("2. U Wareeji (Transfer)");
                System.out.println("3. Kaarka Hadalka/Internet");
                System.out.println("4. Ku iibso (Merchant Payment)");
                System.out.println("5. Lacag la Bixid (Cash Out)");
                System.out.println("6. Dahabshiil Akoon (Bank)");
                System.out.println("0. Ka Bax");
                System.out.print("Geli doorashadaada: ");

                int choice = input.nextInt();

                switch (choice) {



                    case 1:
                        System.out.println("\n[XISAABTAADA] -> Dooro Nooca:");
                        System.out.println("1. Akoonka Mobilka (Mobile Wallet)");
                        System.out.println("2. Akoonka Kaarka (Airtime)");
                        System.out.println("3. Hadhaaga Dahabshiil Bank");
                        System.out.print("Geli doorashadaada: ");
                        int level2Choice = input.nextInt();

                        if (level2Choice == 1) {
                            System.out.println("\n--- AKOONKA MOBILKA ---");
                            System.out.println("1. Hadhaaga Dollar ($)");
                            System.out.println("2. Hadhaaga Shilin Soomaali (SOS)");
                            System.out.print("Geli doorashadaada: ");
                            int curChoice = input.nextInt();
                            if (curChoice == 1) {
                                System.out.println("\n[XOG]: Macmiil " + customerName + ", E-Dahab-kaagu waa: $" + balanceDollar);
                            } else if (curChoice == 2) {
                                System.out.println("\n[XOG]: Macmiil " + customerName + ", Hadhaaga Shilinka waa: " + balanceShilling + " SOS");
                            }
                        } else if (level2Choice == 2) {
                            System.out.println("\n[XOG]: Hadhaaga Kaarka Hadalka ee kuu haryaa waa: $" + airtimeBalance);
                        } else if (level2Choice == 3) {
                            System.out.println("\n[XOG]: Lacagta kuugu jirta Dahabshiil Bank waa: $" + bankBalanceDollar);
                        } else {
                            System.out.println("\n[KHALAD]: Doorasho khaldan!");
                        }
                        break;


                    case 2:
                        System.out.print("Geli Lambarka Qaataha (E-Dahab): ");
                        String receiverNumber = input.next();
                        System.out.print("Geli Lacagta ($): ");
                        double sendAmount = input.nextDouble();

                        if (sendAmount > 0 && sendAmount <= balanceDollar) {
                            balanceDollar -= sendAmount;
                            System.out.println("[GUUL]: Waxaad $" + sendAmount + " u wareejisay lambarka " + receiverNumber + ".");
                            System.out.println("E-Dahab Haraagaaga cusub: $" + balanceDollar);
                        } else {
                            System.out.println("[KHALAD]: Haraagaagu uguma filna.");
                        }
                        break;


                    case 3:
                        System.out.println(" KAARKA / INTERNET ");
                        System.out.println("1. Ku shubo Kaarka ($1 = 1GB)");
                        System.out.print("Dooro: ");
                        int cardChoice = input.nextInt();
                        if (cardChoice == 1 && balanceDollar >= 1.0) {
                            balanceDollar -= 1.0;
                            airtimeBalance += 1.0;
                            System.out.println("[GUUL]: Waxaad ku shubatay 1GB. Haraaga E-Dahab: $" + balanceDollar);
                        } else {
                            System.out.println("[KHALAD]: Haraagaagu kuguma filna.");
                        }
                        break;



                    case 4:
                        System.out.print("Geli Aqoonsiga Ganacsadaha: ");
                        int merchantId = input.nextInt();
                        System.out.print("Geli Lacagta ($): ");
                        double merchantAmount = input.nextDouble();

                        if (merchantAmount > 0 && merchantAmount <= balanceDollar) {
                            balanceDollar -= merchantAmount;
                            System.out.println("[GUUL]: Waxaad $" + merchantAmount + " u dirtay Ganacsadaha No: " + merchantId);
                        } else {
                            System.out.println("[KHALAD]: Lacagtu kuguma filna.");
                        }
                        break;



                    case 5:
                        System.out.print("Geli Aqoonsiga Wakiilka: ");
                        int agentId = input.nextInt();
                        System.out.print("Geli Lacagta ($): ");
                        double cashOutAmount = input.nextDouble();


                        if (cashOutAmount > 0 && cashOutAmount <= balanceDollar) {
                            balanceDollar -= cashOutAmount;
                            System.out.println("[GUUL]: Fadlan ka qaado $" + cashOutAmount + " Wakiilka No: " + agentId);
                        } else {
                            System.out.println("[KHALAD]: Lacag ku filan maku jirto.");
                        }
                        break;


                    case 6:
                        System.out.println("1. Ka soo wareeji Bank ee keen E-Dahab (Bank to Wallet)");
                        System.out.println("2. Ka wareeji E-Dahab oo u dir Bank (Wallet to Bank)");
                        System.out.println("3. Itus Haraaga Bankiga (Check Bank Balance)");
                        System.out.println("0. Ku noqo Menu-ga Guud");
                        System.out.print("Dooro shaqada: ");
                        int bankChoice = input.nextInt();


                        if (bankChoice == 1) {
                            System.out.print("Geli Lambarka Akoonkaaga Bankiga (Dahabshiil Bank): ");
                            String bankAccount = input.next();
                            System.out.print("Geli Lacagta aad ka soo qaadanayso Bankiga ($): ");
                            double amtFromBank = input.nextDouble();


                            if (amtFromBank > 0 && amtFromBank <= bankBalanceDollar) {
                                bankBalanceDollar -= amtFromBank;
                                balanceDollar += amtFromBank;
                                System.out.println("[GUUL]: Waxaad Akoonka " + bankAccount + " ka soo wareegsatay $" + amtFromBank);
                                System.out.println(" Haraaga cusub ee E-Dahab waa: $" + balanceDollar);
                                System.out.println(" Haraaga cusub ee Bankiga waa: $" + bankBalanceDollar);
                            } else {
                                System.out.println("[KHALAD]: Lacagta kuugu jirta Bankiga uguma filna adiga!");
                            }


                        } else if (bankChoice == 2) {
                            System.out.print("Geli Lambarka Akoonka Bankiga ee loo dirayo: ");
                            String bankAccount = input.next();
                            System.out.print("Geli Lacagta aad u direyso Bankiga ($): ");
                            double amtToBank = input.nextDouble();


                            if (amtToBank > 0 && amtToBank <= balanceDollar) {
                                balanceDollar -= amtToBank;
                                bankBalanceDollar += amtToBank;
                                System.out.println("[GUUL]: Waxaad $" + amtToBank + " u dirtay Akoonka Bankiga ee No: " + bankAccount);
                                System.out.println("-> Haraaga haray ee E-Dahab: $" + balanceDollar);
                                System.out.println("-> Haraaga cusub ee Bankiga: $" + bankBalanceDollar);
                            } else {
                                System.out.println("[KHALAD]: Haraagaaga E-Dahab kuguma filna!");
                            }


                        } else if (bankChoice == 3) {
                            System.out.println("[BANK BALANCE]: Lacagta kuugu jirta Dahabshiil Bank waa: $" + bankBalanceDollar);
                        }
                        break;


                    case 0:
                        System.out.println(" Waad ku mahadsantahay isticmaalka E-Dahab. Maalin wanaagsan!");
                        break;


                    default:
                        System.out.println("[KHALAD]: Lambarka aad dooratay kuma jiro liiska!");
                }
                input.close();
            }
        }
    }

}
