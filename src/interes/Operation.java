package interes;

import java.util.Scanner;
//import java.text.DecimalFormat;

/**
 *
 * @author IIMazterIII
 */
public class Operation {

    /**
     * Para enteros : nextInt() ejemplo : int j = z.nextFloat(); Para float :
     * nextFloat() ejemplo : float j = z.nextFloat(); Para cadenas : nextLine()
     * ejemplo : String j = z.nextLine(); Para doubles : nextDouble()ejemplo :
     * double j = z.nextDouble()*
     */
    public int Isimple(int Isimple) {
        int Ci, TipoT, Tipoi, formule, op;
        double Cfa, Cfb, ia, ib, Is, T, b, j;

        Scanner Z = new Scanner(System.in);

        System.out.println("Indique la opcion para hallar:\n1.Interes Simple"
                + "\n2.Capital\n3.Tasa de Interes\n4.Periodo del Tiempo");
        formule = Z.nextInt();

        if (formule == 1) {
            System.out.println("Ingrese el Capital Inicial o Valor Inicial:");
            Ci = Z.nextInt();
            System.out.println("Indique si la Tasa de interes es:...\n1.Anual"
                    + "\n2.Semestre\n3.Cuatrimestre\n4.Trimestre\n5.Bimestre");
            Tipoi = Z.nextInt();
            if (Tipoi == 1) {
                System.out.println("Introduzca la Tasa anual: 0,0%");
                ia = Z.nextDouble();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 100;
                    Is = Ci + Cfa;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfa);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Anual, al cabo de " + T + " años, los " + Ci + " han ganado " + Cfa);
                } else if (TipoT == 2) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 1200;
                    Is = Ci + Cfa;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfa);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Anual, al cabo de " + T + " meses, los " + Ci + " han ganado " + Cfa);
                } else if (TipoT == 3) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 36500;
                    Is = Ci + Cfa;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfa);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Anual, al cabo de " + T + " dias, los " + Ci + " han ganado " + Cfa);
                }
            } else if (Tipoi == 2) {
                System.out.println("Introduzca la Tasa Semestral: 0,0%");
                ia = Z.nextDouble();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 2;
                    Cfb = Cfa / 100;
                    Is = Ci + Cfb;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Semestral, al cabo de " + T + " años, los " + Ci + " han ganado " + Cfa);
                } else if (TipoT == 2) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 2;
                    Cfb = Cfa / 1200;
                    Is = Ci + Cfb;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Semestral, al cabo de " + T + " meses, los " + Ci + " han ganado " + Cfa);
                } else if (TipoT == 3) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (Ci * ia * T) / 2;
                    Cfb = Cfa / 36500;
                    Is = Ci + Cfb;
                    System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                    System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                    System.out.println("\nA una tasa de interes del " + ia + "% Semestral, al cabo de " + T + " dias, los " + Ci + " han ganado " + Cfa);
                } else if (Tipoi == 3) {
                    System.out.println("Introduzca la Tasa Cuatrimestral: 0,0%");
                    ia = Z.nextDouble();
                    System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                    TipoT = Z.nextInt();
                    if (TipoT == 1) {
                        System.out.printf("Inserte el numero de años: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 3;
                        Cfb = Cfa / 100;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " años, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 2) {
                        System.out.printf("Inserte el numero de meses: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 3;
                        Cfb = Cfa / 1200;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " meses, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 3) {
                        System.out.printf("Inserte el numero de dias: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 3;
                        Cfb = Cfa / 36500;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " dias, los " + Ci + " han ganado " + Cfa);
                    }
                } else if (Tipoi == 4) {
                    System.out.println("Introduzca la Tasa Trimestral: 0,0%");
                    ia = Z.nextDouble();
                    System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                    TipoT = Z.nextInt();
                    if (TipoT == 1) {
                        System.out.printf("Inserte el numero de años: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 4;
                        Cfb = Cfa / 100;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " años, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 2) {
                        System.out.printf("Inserte el numero de meses: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 4;
                        Cfb = Cfa / 1200;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " meses, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 3) {
                        System.out.printf("Inserte el numero de dias: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 4;
                        Cfb = Cfa / 36500;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " dias, los " + Ci + " han ganado " + Cfa);
                    }
                } else if (Tipoi == 5) {
                    System.out.println("Introduzca tasa Bimestral: 0,0%");
                    ia = Z.nextInt();
                    System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                    TipoT = Z.nextInt();
                    if (TipoT == 1) {
                        System.out.printf("Inserte el numero de años: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 6;
                        Cfb = Cfa / 100;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " años, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 2) {
                        System.out.printf("Inserte el numero de meses: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 6;
                        Cfb = Cfa / 1200;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " meses, los " + Ci + " han ganado " + Cfa);
                    } else if (TipoT == 3) {
                        System.out.printf("Inserte el numero de dias: ");
                        T = Z.nextInt();
                        Cfa = (Ci * ia * T) / 6;
                        Cfb = Cfa / 36500;
                        Is = Ci + Cfb;
                        System.out.printf("\nEl Interes Simple es: %.2f", Cfb);
                        System.out.printf("\nEl Capital Final o Valor Final es: %.2f", Is);
                        System.out.println("\nA una tasa de interes del " + ia + "% Cuatrimestral, al cabo de " + T + " dias, los " + Ci + " han ganado " + Cfa);
                    }
                }
            }
        } else if (formule == 2) {
            System.out.println("Ingrese el monto del Interes Simple ");
            Is = Z.nextInt();
            System.out.println("Indique si la Tasa de interes es:...\n1.Anual"
                    + "\n2.Semestre\n3.Cuatrimestre\n4.Trimestre\n5.Bimestre\n6.Mensual");
            Tipoi = Z.nextInt();
            if (Tipoi == 1) {
                System.out.println("Introduzca tasa anual: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 2) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 3) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            } else if (Tipoi == 2) {
                System.out.println("Introduzca tasa Semestre: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 2;
                    Cfa = Cfa / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 2) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 2;
                    Cfa = Cfa / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 3) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 2;
                    Cfa = Cfa / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            } else if (Tipoi == 3) {
                System.out.println("Introduzca tasa Cuatrimestre: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 3;
                    Cfa = Cfa / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 2) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 3;
                    Cfa = Cfa / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 3) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 3;
                    Cfa = Cfa / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            } else if (Tipoi == 4) {
                System.out.println("Introduzca tasa Trimestre: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 4;
                    Cfa = Cfa / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 4;
                    Cfa = Cfa / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 4;
                    Cfa = Cfa / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            } else if (Tipoi == 5) {
                System.out.println("Introduzca tasa Bimestre: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 6;
                    Cfa = Cfa / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de meses: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 6;
                    Cfa = Cfa / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de dias: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 6;
                    Cfa = Cfa / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            } else if (Tipoi == 6) {
                System.out.println("Introduzca tasa Mensual: 0,0%");
                ia = Z.nextInt();
                System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
                TipoT = Z.nextInt();
                if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 12;
                    Cfa = Cfa / 100;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 12;
                    Cfa = Cfa / 1200;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                } else if (TipoT == 1) {
                    System.out.printf("Inserte el numero de años: ");
                    T = Z.nextInt();
                    Cfa = (ia * T) / 12;
                    Cfa = Cfa / 36500;
                    Cfb = Is / Cfa;
                    System.out.printf("\nEl capital final es: %.2f", Cfb);
                }
            }
        } else if (formule == 3) {
            System.out.println("Ingrese el Capital Inicial ");
            Ci = Z.nextInt();
            System.out.println("Ingrese el Capital Final ");
            Cfa = Z.nextInt();
            System.out.println("Indique el estado del Tiempo:\n1.Anual\n2.Mensual\n3.Diario");
            TipoT = Z.nextInt();
            if (TipoT == 1) {
                System.out.printf("Inserte el numero de años: ");
                T = Z.nextInt();
                Is = Cfa - Ci;
                ia = Is / (Ci * T);
                ib = ia * 100;
                System.out.println("\nLa tasa de interes anual es de :" + ib + " %");
            } else if (TipoT == 2) {
                System.out.printf("Inserte el numero de meses: ");
                T = Z.nextInt();
                Is = Cfa - Ci;
                ia = Is / (Ci * T);
                ib = ia * 1200;
                System.out.println("\nLa tasa de interes mensual es de :" + ib + " %");
            } else if (TipoT == 3) {
                System.out.printf("Inserte el numero de dias: ");
                T = Z.nextInt();
                Is = Cfa - Ci;
                ia = Is / (Ci * T);
                ib = ia * 36500;
                System.out.println("\nLa tasa de interes diaria es de :" + ib + " %");
            }
        } else if (formule == 4) {
            System.out.println("Especifique el tipo de la Tasa de interes.\n1.Anual\n2.Semestre\n3.Cuatrimestre\n4.Trimestre\n5.Bismestre");
            Tipoi = Z.nextInt();
            if (Tipoi == 1) {
                System.out.println("Introduzca tasa anual: 0,0%");
                ia = Z.nextInt();
                System.out.println("opcion= 1 .Si tiene el dato del Interes Simple\nopcion= 2 .Si no posee el dato del Interes Simple");
                op = Z.nextInt();
                if (op == 1) {
                    System.out.println("Introduzca el Interes Simple");
                    Is = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    j = (ia * Ci) / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                } else if (op == 2) {
                    System.out.println("Introduzca el Capital Final");
                    Cfa = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    Is = Cfa - Ci;
                    j = (ia * Ci) / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                }
            } else if (Tipoi == 2) {
                System.out.println("Introduzca tasa Semestral: 0,0%");
                ia = Z.nextInt();
                System.out.println("opcion= 1 .Si tiene el dato del Interes Simple\nopcion= 2 .Si no posee el dato del Interes Simple");
                op = Z.nextInt();
                if (op == 1) {
                    System.out.println("Introduzca el Interes Simple");
                    Is = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    j = (ia * Ci) / 2;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                } else if (op == 2) {
                    System.out.println("Introduzca el Capital Final");
                    Cfa = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    Is = Cfa - Ci;
                    j = (ia * Ci) / 2;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                }
            } else if (Tipoi == 3) {
                System.out.println("Introduzca tasa Cuatrimestral: 0,0%");
                ia = Z.nextInt();
                System.out.println("opcion= 1 .Si tiene el dato del Interes Simple\nopcion= 2 .Si no posee el dato del Interes Simple");
                op = Z.nextInt();
                if (op == 1) {
                    System.out.println("Introduzca el Interes Simple");
                    Is = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    j = (ia * Ci) / 3;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                } else if (op == 2) {
                    System.out.println("Introduzca el Capital Final");
                    Cfa = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    Is = Cfa - Ci;
                    j = (ia * Ci) / 3;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                }
            } else if (Tipoi == 4) {
                System.out.println("Introduzca tasa Trimestral: 0,0%");
                ia = Z.nextInt();
                System.out.println("opcion= 1 .Si tiene el dato del Interes Simple\nopcion= 2 .Si no posee el dato del Interes Simple");
                op = Z.nextInt();
                if (op == 1) {
                    System.out.println("Introduzca el Interes Simple");
                    Is = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    j = (ia * Ci) / 4;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                } else if (op == 2) {
                    System.out.println("Introduzca el Capital Final");
                    Cfa = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    Is = Cfa - Ci;
                    j = (ia * Ci) / 4;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                }
            } else if (Tipoi == 5) {
                System.out.println("Introduzca tasa Bimestral: 0,0%");
                ia = Z.nextInt();
                System.out.println("opcion= 1 .Si tiene el dato del Interes Simple\nopcion= 2 .Si no posee el dato del Interes Simple");
                op = Z.nextInt();
                if (op == 1) {
                    System.out.println("Introduzca el Interes Simple");
                    Is = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    j = (ia * Ci) / 6;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                } else if (op == 2) {
                    System.out.println("Introduzca el Capital Final");
                    Cfa = Z.nextDouble();
                    System.out.println("Introduzca el Capital Inicial");
                    Ci = Z.nextInt();
                    Is = Cfa - Ci;
                    j = (ia * Ci) / 6;
                    j = j / 100;
                    T = Is / j;
                    j = T * 12;
                    System.out.println("\nEl Tiempo del capital invertido es: " + T + " años ó " + j + " meses.");
                    System.out.println("\nEl Tiempo durante el cual el capital ha estado invertido, son: " + j + " meses.");
                    System.out.printf("El Tiempo del capital invertido en numero de meses son: %.0f", j);
                }
            }
        }
        return Isimple;
    }

    public int Icompuesto(int Icompuesto) {

        double Ci, T;
        double Cf, i, Ic;
        //DecimalFormat decimal = new DecimalFormat("0.00");

        Scanner Z = new Scanner(System.in);

        System.out.println("ingrese capital inicial");
        Ci = Z.nextInt();
        System.out.println("ingrese Tasa de interes ");
        i = Z.nextInt();
        System.out.println("ingrese Tiempo ");
        T = Z.nextInt();

        Cf = Ci * (Math.pow(1 + i / 100, T));// eleva a una potencia al primer parametro con el segundo

        Ic = Cf - Ci;

        //System.out.println(decimal.format (Cf)); imprime sin texto
        System.out.printf("cuando sauque el dinero sera :%.2f %n", Cf);

        System.out.println("\nel intres compuesto es " + Ic);
        return Icompuesto;
    }
}
