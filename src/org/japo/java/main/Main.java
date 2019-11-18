/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final int NUMERO_DIAS = 7;
        double peso;
        double pesosIntroducidos = 0;

        for (int dia = 0; dia < NUMERO_DIAS; dia++) {

            System.out.printf(Locale.ENGLISH,"Introduce tu peso. Dia %d ....: ", dia + 1);
            peso = SCN.nextDouble();

            pesosIntroducidos += peso;

        }

        System.out.printf(Locale.ENGLISH,"Peso medio de la semana ..........: %.2f%n", pesosIntroducidos / NUMERO_DIAS);

    }
}
