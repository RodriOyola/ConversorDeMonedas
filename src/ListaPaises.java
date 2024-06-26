import java.util.Arrays;
import java.util.List;

public class ListaPaises extends Main {

        public void mostrarListaPaises () {
        System.out.println(listaDePaises);
    }

    List<String> listaDePaises = Arrays.asList("\"AED\\tUAE Dirham\\tUnited Arab Emirates\\n\" +\n" +
                "    " +
                "\"AFN\\tAfghan Afghani\\tAfghanistan\\n\" +\n" +
                "                \"ALL\\tAlbanian Lek\\tAlbania\\n\" +\n" +
                "                \"AMD\\tArmenian Dram\\tArmenia\\n\" +\n" +
                "                \"ANG\\tNetherlands Antillian Guilder\\tNetherlands Antilles\\n\" +\n" +
                "                \"AOA\\tAngolan Kwanza\\tAngola\\n\" +\n" +
                "                \"ARS\\tArgentine Peso\\tArgentina\\n\" +\n" +
                "                \"AUD\\tAustralian Dollar\\tAustralia\\n\" +\n" +
                "                \"AWG\\tAruban Florin\\tAruba\\n\" +\n" +
                "                \"AZN\\tAzerbaijani Manat\\tAzerbaijan\\n\" +\n" +
                "                \"BAM\\tBosnia and Herzegovina Mark\\tBosnia and Herzegovina\\n\" +\n" +
                "                \"BBD\\tBarbados Dollar\\tBarbados\\n\" +\n" +
                "                \"BDT\\tBangladeshi Taka\\tBangladesh\\n\" +\n" +
                "                \"BGN\\tBulgarian Lev\\tBulgaria\\n\" +\n" +
                "                \"BHD\\tBahraini Dinar\\tBahrain\\n\" +\n" +
                "                \"BIF\\tBurundian Franc\\tBurundi\\n\" +\n" +
                "                \"BMD\\tBermudian Dollar\\tBermuda\\n\" +\n" +
                "                \"BND\\tBrunei Dollar\\tBrunei\\n\" +\n" +
                "                \"BOB\\tBolivian Boliviano\\tBolivia\\n\" +\n" +
                "                \"BRL\\tBrazilian Real\\tBrazil\\n\" +\n" +
                "                \"BSD\\tBahamian Dollar\\tBahamas\\n\" +\n" +
                "                \"BTN\\tBhutanese Ngultrum\\tBhutan\\n\" +\n" +
                "                \"BWP\\tBotswana Pula\\tBotswana\\n\" +\n" +
                "                \"BYN\\tBelarusian Ruble\\tBelarus\\n\" +\n" +
                "                \"BZD\\tBelize Dollar\\tBelize\\n\" +\n" +
                "                \"CAD\\tCanadian Dollar\\tCanada\\n\" +\n" +
                "                \"CDF\\tCongolese Franc\\tDemocratic Republic of the Congo\\n\" +\n" +
                "                \"CHF\\tSwiss Franc\\tSwitzerland\\n\" +\n" +
                "                \"CLP\\tChilean Peso\\tChile\\n\" +\n" +
                "                \"CNY\\tChinese Renminbi\\tChina\\n\" +\n" +
                "                \"COP\\tColombian Peso\\tColombia\\n\" +\n" +
                "                \"CRC\\tCosta Rican Colon\\tCosta Rica\\n\" +\n" +
                "                \"CUP\\tCuban Peso\\tCuba\\n\" +\n" +
                "                \"CVE\\tCape Verdean Escudo\\tCape Verde\\n\" +\n" +
                "                \"CZK\\tCzech Koruna\\tCzech Republic\\n\" +\n" +
                "                \"DJF\\tDjiboutian Franc\\tDjibouti\\n\" +\n" +
                "                \"DKK\\tDanish Krone\\tDenmark\\n\" +\n" +
                "                \"DOP\\tDominican Peso\\tDominican Republic\\n\" +\n" +
                "                \"DZD\\tAlgerian Dinar\\tAlgeria\\n\" +\n" +
                "                \"EGP\\tEgyptian Pound\\tEgypt\\n\" +\n" +
                "                \"ERN\\tEritrean Nakfa\\tEritrea\\n\" +\n" +
                "                \"ETB\\tEthiopian Birr\\tEthiopia\\n\" +\n" +
                "                \"EUR\\tEuro\\tEuropean Union\\n\" +\n" +
                "                \"FJD\\tFiji Dollar\\tFiji\\n\" +\n" +
                "                \"FKP\\tFalkland Islands Pound\\tFalkland Islands\\n\" +\n" +
                "                \"FOK\\tFaroese Króna\\tFaroe Islands\\n\" +\n" +
                "                \"GBP\\tPound Sterling\\tUnited Kingdom\\n\" +\n" +
                "                \"GEL\\tGeorgian Lari\\tGeorgia\\n\" +\n" +
                "                \"GGP\\tGuernsey Pound\\tGuernsey\\n\" +\n" +
                "                \"GHS\\tGhanaian Cedi\\tGhana\\n\" +\n" +
                "                \"GIP\\tGibraltar Pound\\tGibraltar\\n\" +\n" +
                "                \"GMD\\tGambian Dalasi\\tThe Gambia\\n\" +\n" +
                "                \"GNF\\tGuinean Franc\\tGuinea\\n\" +\n" +
                "                \"GTQ\\tGuatemalan Quetzal\\tGuatemala\\n\" +\n" +
                "                \"GYD\\tGuyanese Dollar\\tGuyana\\n\" +\n" +
                "                \"HKD\\tHong Kong Dollar\\tHong Kong\\n\" +\n" +
                "                \"HNL\\tHonduran Lempira\\tHonduras\\n\" +\n" +
                "                \"HRK\\tCroatian Kuna\\tCroatia\\n\" +\n" +
                "                \"HTG\\tHaitian Gourde\\tHaiti\\n\" +\n" +
                "                \"HUF\\tHungarian Forint\\tHungary\\n\" +\n" +
                "                \"IDR\\tIndonesian Rupiah\\tIndonesia\\n\" +\n" +
                "                \"ILS\\tIsraeli New Shekel\\tIsrael\\n\" +\n" +
                "                \"IMP\\tManx Pound\\tIsle of Man\\n\" +\n" +
                "                \"INR\\tIndian Rupee\\tIndia\\n\" +\n" +
                "                \"IQD\\tIraqi Dinar\\tIraq\\n\" +\n" +
                "                \"IRR\\tIranian Rial\\tIran\\n\" +\n" +
                "                \"ISK\\tIcelandic Króna\\tIceland\\n\" +\n" +
                "                \"JEP\\tJersey Pound\\tJersey\\n\" +\n" +
                "                \"JMD\\tJamaican Dollar\\tJamaica\\n\" +\n" +
                "                \"JOD\\tJordanian Dinar\\tJordan\\n\" +\n" +
                "                \"JPY\\tJapanese Yen\\tJapan\\n\" +\n" +
                "                \"KES\\tKenyan Shilling\\tKenya\\n\" +\n" +
                "                \"KGS\\tKyrgyzstani Som\\tKyrgyzstan\\n\" +\n" +
                "                \"KHR\\tCambodian Riel\\tCambodia\\n\" +\n" +
                "                \"KID\\tKiribati Dollar\\tKiribati\\n\" +\n" +
                "                \"KMF\\tComorian Franc\\tComoros\\n\" +\n" +
                "                \"KRW\\tSouth Korean Won\\tSouth Korea\\n\" +\n" +
                "                \"KWD\\tKuwaiti Dinar\\tKuwait\\n\" +\n" +
                "                \"KYD\\tCayman Islands Dollar\\tCayman Islands\\n\" +\n" +
                "                \"KZT\\tKazakhstani Tenge\\tKazakhstan\\n\" +\n" +
                "                \"LAK\\tLao Kip\\tLaos\\n\" +\n" +
                "                \"LBP\\tLebanese Pound\\tLebanon\\n\" +\n" +
                "                \"LKR\\tSri Lanka Rupee\\tSri Lanka\\n\" +\n" +
                "                \"LRD\\tLiberian Dollar\\tLiberia\\n\" +\n" +
                "                \"LSL\\tLesotho Loti\\tLesotho\\n\" +\n" +
                "                \"LYD\\tLibyan Dinar\\tLibya\\n\" +\n" +
                "                \"MAD\\tMoroccan Dirham\\tMorocco\\n\" +\n" +
                "                \"MDL\\tMoldovan Leu\\tMoldova\\n\" +\n" +
                "                \"MGA\\tMalagasy Ariary\\tMadagascar\\n\" +\n" +
                "                \"MKD\\tMacedonian Denar\\tNorth Macedonia\\n\" +\n" +
                "                \"MMK\\tBurmese Kyat\\tMyanmar\\n\" +\n" +
                "                \"MNT\\tMongolian Tögrög\\tMongolia\\n\" +\n" +
                "                \"MOP\\tMacanese Pataca\\tMacau\\n\" +\n" +
                "                \"MRU\\tMauritanian Ouguiya\\tMauritania\\n\" +\n" +
                "                \"MUR\\tMauritian Rupee\\tMauritius\\n\" +\n" +
                "                \"MVR\\tMaldivian Rufiyaa\\tMaldives\\n\" +\n" +
                "                \"MWK\\tMalawian Kwacha\\tMalawi\\n\" +\n" +
                "                \"MXN\\tMexican Peso\\tMexico\\n\" +\n" +
                "                \"MYR\\tMalaysian Ringgit\\tMalaysia\\n\" +\n" +
                "                \"MZN\\tMozambican Metical\\tMozambique\\n\" +\n" +
                "                \"NAD\\tNamibian Dollar\\tNamibia\\n\" +\n" +
                "                \"NGN\\tNigerian Naira\\tNigeria\\n\" +\n" +
                "                \"NIO\\tNicaraguan Córdoba\\tNicaragua\\n\" +\n" +
                "                \"NOK\\tNorwegian Krone\\tNorway\\n\" +\n" +
                "                \"NPR\\tNepalese Rupee\\tNepal\\n\" +\n" +
                "                \"NZD\\tNew Zealand Dollar\\tNew Zealand\\n\" +\n" +
                "                \"OMR\\tOmani Rial\\tOman\\n\" +\n" +
                "                \"PAB\\tPanamanian Balboa\\tPanama\\n\" +\n" +
                "                \"PEN\\tPeruvian Sol\\tPeru\\n\" +\n" +
                "                \"PGK\\tPapua New Guinean Kina\\tPapua New Guinea\\n\" +\n" +
                "                \"PHP\\tPhilippine Peso\\tPhilippines\\n\" +\n" +
                "                \"PKR\\tPakistani Rupee\\tPakistan\\n\" +\n" +
                "                \"PLN\\tPolish Złoty\\tPoland\\n\" +\n" +
                "                \"PYG\\tParaguayan Guaraní\\tParaguay\\n\" +\n" +
                "                \"QAR\\tQatari Riyal\\tQatar\\n\" +\n" +
                "                \"RON\\tRomanian Leu\\tRomania\\n\" +\n" +
                "                \"RSD\\tSerbian Dinar\\tSerbia\\n\" +\n" +
                "                \"RUB\\tRussian Ruble\\tRussia\\n\" +\n" +
                "                \"RWF\\tRwandan Franc\\tRwanda\\n\" +\n" +
                "                \"SAR\\tSaudi Riyal\\tSaudi Arabia\\n\" +\n" +
                "                \"SBD\\tSolomon Islands Dollar\\tSolomon Islands\\n\" +\n" +
                "                \"SCR\\tSeychellois Rupee\\tSeychelles\\n\" +\n" +
                "                \"SDG\\tSudanese Pound\\tSudan\\n\" +\n" +
                "                \"SEK\\tSwedish Krona\\tSweden\\n\" +\n" +
                "                \"SGD\\tSingapore Dollar\\tSingapore\\n\" +\n" +
                "                \"SHP\\tSaint Helena Pound\\tSaint Helena\\n\" +\n" +
                "                \"SLE\\tSierra Leonean Leone\\tSierra Leone\\n\" +\n" +
                "                \"SOS\\tSomali Shilling\\tSomalia\\n\" +\n" +
                "                \"SRD\\tSurinamese Dollar\\tSuriname\\n\" +\n" +
                "                \"SSP\\tSouth Sudanese Pound\\tSouth Sudan\\n\" +\n" +
                "                \"STN\\tSão Tomé and Príncipe Dobra\\tSão Tomé and Príncipe\\n\" +\n" +
                "                \"SYP\\tSyrian Pound\\tSyria\\n\" +\n" +
                "                \"SZL\\tEswatini Lilangeni\\tEswatini\\n\" +\n" +
                "                \"THB\\tThai Baht\\tThailand\\n\" +\n" +
                "                \"TJS\\tTajikistani Somoni\\tTajikistan\\n\" +\n" +
                "                \"TMT\\tTurkmenistan Manat\\tTurkmenistan\\n\" +\n" +
                "                \"TND\\tTunisian Dinar\\tTunisia\\n\" +\n" +
                "                \"TOP\\tTongan Paʻanga\\tTonga\\n\" +\n" +
                "                \"TRY\\tTurkish Lira\\tTurkey\\n\" +\n" +
                "                \"TTD\\tTrinidad and Tobago Dollar\\tTrinidad and Tobago\\n\" +\n" +
                "                \"TVD\\tTuvaluan Dollar\\tTuvalu\\n\" +\n" +
                "                \"TWD\\tNew Taiwan Dollar\\tTaiwan\\n\" +\n" +
                "                \"TZS\\tTanzanian Shilling\\tTanzania\\n\" +\n" +
                "                \"UAH\\tUkrainian Hryvnia\\tUkraine\\n\" +\n" +
                "                \"UGX\\tUgandan Shilling\\tUganda\\n\" +\n" +
                "                \"USD\\tUnited States Dollar\\tUnited States\\n\" +\n" +
                "                \"UYU\\tUruguayan Peso\\tUruguay\\n\" +\n" +
                "                \"UZS\\tUzbekistani So'm\\tUzbekistan\\n\" +\n" +
                "                \"VES\\tVenezuelan Bolívar Soberano\\tVenezuela\\n\" +\n" +
                "                \"VND\\tVietnamese Đồng\\tVietnam\\n\" +\n" +
                "                \"VUV\\tVanuatu Vatu\\tVanuatu\\n\" +\n" +
                "                \"WST\\tSamoan Tālā\\tSamoa\\n\" +\n" +
                "                \"XAF\\tCentral African CFA Franc\\tCEMAC\\n\" +\n" +
                "                \"XCD\\tEast Caribbean Dollar\\tOrganisation of Eastern Caribbean States\\n\" +\n" +
                "                \"XDR\\tSpecial Drawing Rights\\tInternational Monetary Fund\\n\" +\n" +
                "                \"XOF\\tWest African CFA franc\\tCFA\\n\" +\n" +
                "                \"XPF\\tCFP Franc\\tCollectivités d'Outre-Mer\\n\" +\n" +
                "                \"YER\\tYemeni Rial\\tYemen\\n\" +\n" +
                "                \"ZAR\\tSouth African Rand\\tSouth Africa\\n\" +\n" +
                "                \"ZMW\\tZambian Kwacha\\tZambia\\n\" +\n" +
                "                \"ZWL\\tZimbabwean Dollar\\tZimbabwe\");");
    }
