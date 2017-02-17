package com.airg.android;

import android.support.annotation.DrawableRes;

import com.airg.android.countries.R;

import java.util.Arrays;
import java.util.Comparator;

/**
 * A list of countries, their latin and localized names, their international prefix codes, and alpha2 and alpha3 codes.
 *
 * @author Mahram Z. Foadi
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public enum Country {
    /**
     * Afghanistan
     */
    AF("AFG", "Afghanistan", "\u202Bافغانستان\u202C\u200E", 93, R.drawable.ic_flag_af),
    /**
     * Åland Islands
     */
    AX("ALA", "Åland Islands", null, 358, R.drawable.ic_flag_ax),
    /**
     * Albania
     */
    AL("ALB", "Albania", "Shqipëri", 355, R.drawable.ic_flag_al),
    /**
     * Algeria
     */
    DZ("DZA", "Algeria", "\u202Bالجزائر\u202C\u200E", 213, R.drawable.ic_flag_dz),
    /**
     * American Samoa
     */
    AS("ASM", "American Samoa", null, 1684, R.drawable.ic_flag_as),
    /**
     * Andorra
     */
    AD("AND", "Andorra", null, 376, R.drawable.ic_flag_ad),
    /**
     * Angola
     */
    AO("AGO", "Angola", null, 244, R.drawable.ic_flag_ao),
    /**
     * Anguilla
     */
    AI("AIA", "Anguilla", null, 1264, R.drawable.ic_flag_ai),
    /**
     * Antigua and Barbuda
     */
    AG("ATG", "Antigua and Barbuda", null, 1268, R.drawable.ic_flag_ag),
    /**
     * Argentina
     */
    AR("ARG", "Argentina", null, 54, R.drawable.ic_flag_ar),
    /**
     * Armenia
     */
    AM("ARM", "Armenia", "Հայաստան", 374, R.drawable.ic_flag_am),
    /**
     * Aruba
     */
    AW("ABW", "Aruba", null, 297, R.drawable.ic_flag_aw),
    /**
     * Australia
     */
    AU("AUS", "Australia", null, 61, R.drawable.ic_flag_au),
    /**
     * Austria
     */
    AT("AUT", "Austria", "Österreich", 43, R.drawable.ic_flag_at),
    /**
     * Azerbaijan
     */
    AZ("AZE", "Azerbaijan", "Azərbaycan", 994, R.drawable.ic_flag_az),
    /**
     * Bahamas
     */
    BS("BHS", "Bahamas", null, 1242, R.drawable.ic_flag_bs),
    /**
     * Bahrain
     */
    BH("BHR", "Bahrain", "\u202Bالبحرين\u202C\u200E", 973, R.drawable.ic_flag_bh),
    /**
     * Bangladesh
     */
    BD("BGD", "Bangladesh", "বাংলাদেশ", 880, R.drawable.ic_flag_bd),
    /**
     * Barbados
     */
    BB("BRB", "Barbados", null, 1246, R.drawable.ic_flag_bb),
    /**
     * Belarus
     */
    BY("BLR", "Belarus", "Беларусь", 375, R.drawable.ic_flag_by),
    /**
     * Belgium
     */
    BE("BEL", "Belgium", "België", 32, R.drawable.ic_flag_be),
    /**
     * Belize
     */
    BZ("BLZ", "Belize", null, 501, R.drawable.ic_flag_bz),
    /**
     * Benin
     */
    BJ("BEN", "Benin", "Bénin", 229, R.drawable.ic_flag_bj),
    /**
     * Bermuda
     */
    BM("BMU", "Bermuda", null, 1441, R.drawable.ic_flag_bm),
    /**
     * Bhutan
     */
    BT("BTN", "Bhutan", "འབྲུག", 975, R.drawable.ic_flag_bt),
    /**
     * Bolivia
     */
    BO("BOL", "Bolivia", null, 591, R.drawable.ic_flag_bo),
    /**
     * Bosnia and Herzegovina
     */
    BA("BIH", "Bosnia and Herzegovina", "Босна и Херцеговина", 387, R.drawable.ic_flag_ba),
    /**
     * Botswana
     */
    BW("BWA", "Botswana", null, 267, R.drawable.ic_flag_bw),
    /**
     * Brazil
     */
    BR("BRA", "Brazil", "Brasil", 55, R.drawable.ic_flag_br),
    /**
     * British Indian Ocean Territory
     */
    IO("IOT", "British Indian Ocean Territory", null, 246, R.drawable.ic_flag_io),
    /**
     * British Virgin Islands
     */
    VG("VGB", "British Virgin Islands", null, 1284, R.drawable.ic_flag_vg),
    /**
     * Brunei
     */
    BN("BRN", "Brunei", null, 673, R.drawable.ic_flag_bn),
    /**
     * Bulgaria
     */
    BG("BGR", "Bulgaria", "България", 359, R.drawable.ic_flag_bg),
    /**
     * Burkina Faso
     */
    BF("BFA", "Burkina Faso", null, 226, R.drawable.ic_flag_bf),
    /**
     * Burundi
     */
    BI("BDI", "Burundi", "Uburundi", 257, R.drawable.ic_flag_bi),
    /**
     * Cambodia
     */
    KH("KHM", "Cambodia", "កម្ពុជា", 855, R.drawable.ic_flag_kh),
    /**
     * Cameroon
     */
    CM("CMR", "Cameroon", "Cameroun", 237, R.drawable.ic_flag_cm),
    /**
     * Canada
     */
    CA("CAN", "Canada", null, 1, R.drawable.ic_flag_ca),
    /**
     * Cape Verde
     */
    CV("CPV", "Cape Verde", "Kabu Verdi", 238, R.drawable.ic_flag_cv),
    /**
     * Caribbean Netherlands
     */
    BQ("BES", "Caribbean Netherlands", null, 599, R.drawable.ic_flag_nl),
    /**
     * Cayman Islands
     */
    KY("CYM", "Cayman Islands", null, 1345, R.drawable.ic_flag_ky),
    /**
     * Central African Republic
     */
    CF("CAF", "Central African Republic", "République centrafricaine", 236, R.drawable.ic_flag_cf),
    /**
     * Chad
     */
    TD("TCD", "Chad", "Tchad", 235, R.drawable.ic_flag_td),
    /**
     * Chile
     */
    CL("CHL", "Chile", null, 56, R.drawable.ic_flag_cl),
    /**
     * China
     */
    CN("CHN", "China", "中国", 86, R.drawable.ic_flag_cn),
    /**
     * Christmas Island
     */
    CX("CXR", "Christmas Island", null, 61, R.drawable.ic_flag_cx),
    /**
     * Cocos (Keeling) Islands
     */
    CC("CCK", "Cocos (Keeling) Islands", null, 61, R.drawable.ic_flag_cc),
    /**
     * Colombia
     */
    CO("COL", "Colombia", null, 57, R.drawable.ic_flag_co),
    /**
     * Comoros Islands
     */
    KM("COM", "Comoros Islands", "\u202Bجزر القمر\u202C\u200E", 269, R.drawable.ic_flag_km),
    /**
     * Congo, Democratic Republic of)
     */
    CD("COD", "Congo (DRC)", "Jamhuri ya Kidemokrasia ya Kongo", 234, R.drawable.ic_flag_cd),
    /**
     * Congo, Republic of
     */
    CG("COG", "Congo (Republic)", "Congo-Brazzaville", 242, R.drawable.ic_flag_cg),
    /**
     * Cook Islands
     */
    CK("COK", "Cook Islands", null, 682, R.drawable.ic_flag_ck),
    /**
     * Costa Rica
     */
    CR("CRI", "Costa Rica", null, 506, R.drawable.ic_flag_cr),
    /**
     * Ivory Coast
     */
    CI("CIV", "Ivory Coast", "Côte d’Ivoire", 225, R.drawable.ic_flag_ci),
    /**
     * Croatia
     */
    HR("HRV", "Croatia", "Hrvatska", 385, R.drawable.ic_flag_hr),
    /**
     * Cuba
     */
    CU("CUB", "Cuba", null, 53, R.drawable.ic_flag_cu),
    /**
     * Curacao
     */
    CW("CUW", "Curacao", "Curaçao", 599, R.drawable.ic_flag_cw),
    /**
     * Cyprus
     */
    CY("CYP", "Cyprus", "Κύπρος", 357, R.drawable.ic_flag_cy),
    /**
     * Czech Republic
     */
    CZ("CZE", "Czech Republic", "Česká republika", 420, R.drawable.ic_flag_cz),
    /**
     * Denmark
     */
    DK("DNK", "Denmark", "Danmark", 45, R.drawable.ic_flag_dk),
    /**
     * Djibouti
     */
    DJ("DJI", "Djibouti", null, 253, R.drawable.ic_flag_dj),
    /**
     * Dominica
     */
    DM("DMA", "Dominica", null, 1767, R.drawable.ic_flag_dm),
    /**
     * Dominican Republic
     */
    DO("DOM", "Dominican Republic", "República Dominicana", 1, R.drawable.ic_flag_do),
    /**
     * Ecuador
     */
    EC("ECU", "Ecuador", null, 593, R.drawable.ic_flag_ec),
    /**
     * Egypt
     */
    EG("EGY", "Egypt", "\u202Bمصر\u202C\u200E", 20, R.drawable.ic_flag_eg),
    /**
     * El Salvador
     */
    SV("SLV", "El Salvador", null, 503, R.drawable.ic_flag_sv),
    /**
     * Equatorial Guinea
     */
    GQ("GNQ", "Equatorial Guinea", "Guinea Ecuatorial", 240, R.drawable.ic_flag_gq),
    /**
     * Eritrea
     */
    ER("ERI", "Eritrea", null, 291, R.drawable.ic_flag_er),
    /**
     * Estonia
     */
    EE("EST", "Estonia", "Eesti", 372, R.drawable.ic_flag_ee),
    /**
     * Ethiopia
     */
    ET("ETH", "Ethiopia", null, 251, R.drawable.ic_flag_et),
    /**
     * Falkland Islands
     */
    FK("FLK", "Falkland Islands", "Islas Malvinas", 500, R.drawable.ic_flag_fk),
    /**
     * Faroe Islands
     */
    FO("FRO", "Faroe Islands", "Føroyar", 298, R.drawable.ic_flag_fo),
    /**
     * Fiji
     */
    FJ("FJI", "Fiji", null, 679, R.drawable.ic_flag_fj),
    /**
     * Finland
     */
    FI("FIN", "Finland", "Suomi", 358, R.drawable.ic_flag_fi),
    /**
     * France
     */
    FR("FRA", "France", null, 33, R.drawable.ic_flag_fr),
    /**
     * French Guiana
     */
    GF("GUF", "French Guiana", "Guyane française", 594, R.drawable.ic_flag_gf),
    /**
     * French Polynesia
     */
    PF("PYF", "French Polynesia", "Polynésie française", 689, R.drawable.ic_flag_pf),
    /**
     * Gabon
     */
    GA("GAB", "Gabon", null, 241, R.drawable.ic_flag_ga),
    /**
     * Gambia
     */
    GM("GMB", "Gambia", null, 220, R.drawable.ic_flag_gm),
    /**
     * Georgia
     */
    GE("GEO", "Georgia", "საქართველო", 995, R.drawable.ic_flag_ge),
    /**
     * Germany
     */
    DE("DEU", "Germany", "Deutschland", 49, R.drawable.ic_flag_de),
    /**
     * Ghana
     */
    GH("GHA", "Ghana", "Gaana", 233, R.drawable.ic_flag_gh),
    /**
     * Gibraltar
     */
    GI("GIB", "Gibraltar", null, 350, R.drawable.ic_flag_gi),
    /**
     * Greece
     */
    GR("GRC", "Greece", "Ελλάδα", 30, R.drawable.ic_flag_gr),
    /**
     * Greenland
     */
    GL("GRL", "Greenland", "Kalaallit Nunaat", 299, R.drawable.ic_flag_gl),
    /**
     * Grenada
     */
    GD("GRD", "Grenada", null, 1473, R.drawable.ic_flag_gd),
    /**
     * Guadeloupe
     */
    GP("GLP", "Guadeloupe", null, 590, R.drawable.ic_flag_fr),
    /**
     * Guam
     */
    GU("GUM", "Guam", null, 1671, R.drawable.ic_flag_gu),
    /**
     * Guatemala
     */
    GT("GTM", "Guatemala", null, 502, R.drawable.ic_flag_gt),
    /**
     * Guernsey
     */
    GG("GGY", "Guernsey", null, 44, R.drawable.ic_flag_gg),
    /**
     * Guinea
     */
    GN("GIN", "Guinea", "Guinée", 224, R.drawable.ic_flag_gn),
    /**
     * Guinea-Bissau
     */
    GW("GNB", "Guinea-Bissau", "Guiné Bissau", 245, R.drawable.ic_flag_gw),
    /**
     * Guyana
     */
    GY("GUY", "Guyana", null, 592, R.drawable.ic_flag_gy),
    /**
     * Haiti
     */
    HT("HTI", "Haiti", null, 509, R.drawable.ic_flag_ht),
    /**
     * Honduras
     */
    HN("HND", "Honduras", null, 504, R.drawable.ic_flag_hn),
    /**
     * Hong Kong
     */
    HK("HKG", "Hong Kong", "香港", 852, R.drawable.ic_flag_hk),
    /**
     * Hungary
     */
    HU("HUN", "Hungary", "Magyarország", 36, R.drawable.ic_flag_hu),
    /**
     * Iceland
     */
    IS("ISL", "Iceland", "Ísland", 354, R.drawable.ic_flag_is),
    /**
     * India
     */
    IN("IND", "India", "भारत", 91, R.drawable.ic_flag_in),
    /**
     * Indonesia
     */
    ID("IDN", "Indonesia", null, 62, R.drawable.ic_flag_id),
    /**
     * Iran
     */
    IR("IRN", "Iran" , "\u202Bایران\u202C\u200E", 98, R.drawable.ic_flag_ir),
    /**
     * Iraq
     */
    IQ("IRQ", "Iraq", "\u202Bالعراق\u202C\u200E", 964, R.drawable.ic_flag_iq),
    /**
     * Ireland
     */
    IE("IRL", "Ireland", null, 353, R.drawable.ic_flag_ie),
    /**
     * Isle of Man
     */
    IM("IMN", "Isle of Man", null, 44, R.drawable.ic_flag_im),
    /**
     * Israel
     */
    IL("ISR", "Israel", "\u202Bישראל\u202C\u200E", 972, R.drawable.ic_flag_il),
    /**
     * Italy
     */
    IT("ITA", "Italy", "Italia", 39, R.drawable.ic_flag_it),
    /**
     * Jamaica
     */
    JM("JAM", "Jamaica", null, 1876, R.drawable.ic_flag_jm),
    /**
     * Japan
     */
    JP("JPN", "Japan", "日本", 81, R.drawable.ic_flag_jp),
    /**
     * Jersey
     */
    JE("JEY", "Jersey", null, 44, R.drawable.ic_flag_je),
    /**
     * Jordan
     */
    JO("JOR", "Jordan", "\u202Bالأردن\u202C\u200E", 962, R.drawable.ic_flag_jo),
    /**
     * Kazakhstan
     */
    KZ("KAZ", "Kazakhstan", "Казахстан", 7, R.drawable.ic_flag_kz),
    /**
     * Kenya
     */
    KE("KEN", "Kenya", null, 254, R.drawable.ic_flag_ke),
    /**
     * Kiribati
     */
    KI("KIR", "Kiribati", null, 686, R.drawable.ic_flag_ki),
    /**
     * Kosovo
     */
    KS("KSV", "Kosovo", null, 383, R.drawable.ic_flag_ks),
    /**
     * Kuwait
     */
    KW("KWT", "Kuwait", "\u202Bالكويت\u202C\u200E", 965, R.drawable.ic_flag_kw),
    /**
     * Kyrgyzstan
     */
    KG("KGZ", "Kyrgyzstan", "Кыргызстан", 996, R.drawable.ic_flag_kg),
    /**
     * Laos
     */
    LA("LAO", "Laos", "ລາວ", 856, R.drawable.ic_flag_la),
    /**
     * Latvia
     */
    LV("LVA", "Latvia ", "Latvija", 371, R.drawable.ic_flag_lv),
    /**
     * Lebanon
     */
    LB("LBN", "Lebanon", "\u202Bلبنان\u202C\u200E", 961, R.drawable.ic_flag_lb),
    /**
     * Lesotho
     */
    LS("LSO", "Lesotho", null, 266, R.drawable.ic_flag_ls),
    /**
     * Liberia
     */
    LR("LBR", "Liberia", null, 231, R.drawable.ic_flag_lr),
    /**
     * Libya
     */
    LY("LBY", "Libya", "\u202Bليبيا\u202C\u200E", 218, R.drawable.ic_flag_ly),
    /**
     * Liechtenstein
     */
    LI("LIE", "Liechtenstein", null, 423, R.drawable.ic_flag_li),
    /**
     * Lithuania
     */
    LT("LTU", "Lithuania", "Lietuva", 370, R.drawable.ic_flag_lt),
    /**
     * Luxembourg
     */
    LU("LUX", "Luxembourg", null, 352, R.drawable.ic_flag_lu),
    /**
     * Macau
     */
    MO("MAC", "Macau", "澳門", 853, R.drawable.ic_flag_mo),
    /**
     * Macedonia
     */
    MK("MKD", "Macedonia", "Македонија", 389, R.drawable.ic_flag_mk),
    /**
     * Madagascar
     */
    MG("MDG", "Madagascar", "Madagasikara", 261, R.drawable.ic_flag_mg),
    /**
     * Malawi
     */
    MW("MWI", "Malawi", null, 265, R.drawable.ic_flag_mw),
    /**
     * Malaysia
     */
    MY("MYS", "Malaysia", null, 60, R.drawable.ic_flag_my),
    /**
     * Maldives
     */
    MV("MDV", "Maldives", null, 960, R.drawable.ic_flag_mv),
    /**
     * Mali
     */
    ML("MLI", "Mali", null, 223, R.drawable.ic_flag_ml),
    /**
     * Malta
     */
    MT("MLT", "Malta", null, 356, R.drawable.ic_flag_mt),
    /**
     * Marshall Islands
     */
    MH("MHL", "Marshall Islands", null, 692, R.drawable.ic_flag_mh),
    /**
     * Martinique
     */
    MQ("MTQ", "Martinique", null, 596, R.drawable.ic_flag_mq),
    /**
     * Mauritania
     */
    MR("MRT", "Mauritania", "\u202Bموريتانيا\u202C\u200E", 222, R.drawable.ic_flag_mr),
    /**
     * Mauritius
     */
    MU("MUS", "Mauritius", "Moris", 230, R.drawable.ic_flag_mu),
    /**
     * Mayotte
     */
    YT("MYT", "Mayotte", null, 262, R.drawable.ic_flag_yt),
    /**
     * Mexico
     */
    MX("MEX", "Mexico", "México", 52, R.drawable.ic_flag_mx),
    /**
     * Micronesia
     */
    FM("FSM", "Micronesia", null, 691, R.drawable.ic_flag_fm),
    /**
     * Moldova
     */
    MD("MDA", "Moldova", "Republica Moldova", 373, R.drawable.ic_flag_md),
    /**
     * Monaco
     */
    MC("MCO", "Monaco", null, 377, R.drawable.ic_flag_mc),
    /**
     * Mongolia
     */
    MN("MNG", "Mongolia", "Монгол", 976, R.drawable.ic_flag_mn),
    /**
     * Montenegro
     */
    ME("MNE", "Montenegro", "Crna Gora", 382, R.drawable.ic_flag_me),
    /**
     * Montserrat
     */
    MS("MSR", "Montserrat", null, 1664, R.drawable.ic_flag_ms),
    /**
     * Morocco
     */
    MA("MAR", "Morocco", "\u202Bالمغرب\u202C\u200E", 212, R.drawable.ic_flag_ma),
    /**
     * Mozambique
     */
    MZ("MOZ", "Mozambique", "Moçambique", 258, R.drawable.ic_flag_mz),
    /**
     * Myanmar
     */
    MM("MMR", "Myanmar", "မြန်မာ", 95, R.drawable.ic_flag_mm),
    /**
     * Namibia
     */
    NA("NAM", "Namibia", "Namibië", 264, R.drawable.ic_flag_na),
    /**
     * Nauru
     */
    NR("NRU", "Nauru", null, 674, R.drawable.ic_flag_nr),
    /**
     * Nepal
     */
    NP("NPL", "Nepal", "नेपाल", 977, R.drawable.ic_flag_np),
    /**
     * Netherlands
     */
    NL("NLD", "Netherlands", "Nederland", 31, R.drawable.ic_flag_nl),
    /**
     * New Caledonia
     */
    NC("NCL", "New Caledonia", "Nouvelle-Calédonie", 687, R.drawable.ic_flag_nc),
    /**
     * New Zealand
     */
    NZ("NZL", "New Zealand", null, 64, R.drawable.ic_flag_nz),
    /**
     * Nicaragua
     */
    NI("NIC", "Nicaragua", null, 505, R.drawable.ic_flag_ni),
    /**
     * Niger
     */
    NE("NER", "Niger", "Nijar", 227, R.drawable.ic_flag_ne),
    /**
     * Nigeria
     */
    NG("NGA", "Nigeria", null, 234, R.drawable.ic_flag_ng),
    /**
     * Niue
     */
    NU("NIU", "Niue", null, 683, R.drawable.ic_flag_nu),
    /**
     * Norfolk Island
     */
    NF("NFK", "Norfolk Island", null, 672, R.drawable.ic_flag_nf),
    /**
     * North Korea
     */
    KP("PRK", "North Korea", "조선 민주주의 인민 공화국", 850, R.drawable.ic_flag_kp),
    /**
     * Northern Mariana Islands
     */
    MP("MNP", "Northern Mariana Islands", null, 1670, R.drawable.ic_flag_mp),
    /**
     * Norway
     */
    NO("NOR", "Norway", "Norge", 47, R.drawable.ic_flag_no),
    /**
     * Oman
     */
    OM("OMN", "Oman", "\u202Bعُمان\u202C\u200E", 968, R.drawable.ic_flag_om),
    /**
     * Pakistan
     */
    PK("pak", "Pakistan", "\u202Bپاکستان\u202C\u200E", 92, R.drawable.ic_flag_pk),
    /**
     * Palau
     */
    PW("PLW", "Palau", null, 680, R.drawable.ic_flag_pw),
    /**
     * Palestine
     */
    PS("PSE", "Palestine", "\u202Bفلسطين\u202C\u200E", 970, R.drawable.ic_flag_ps),
    /**
     * Panama
     */
    PA("PAN", "Panama", "Panamá", 507, R.drawable.ic_flag_pa),
    /**
     * Papua New Guinea
     */
    PG("PNG", "Papua New Guinea", null, 675, R.drawable.ic_flag_pg),
    /**
     * Paraguay
     */
    PY("PRY", "Paraguay", null, 595, R.drawable.ic_flag_py),
    /**
     * Peru
     */
    PE("PER", "Peru", "Perú", 51, R.drawable.ic_flag_pe),
    /**
     * Philippines
     */
    PH("PHL", "Philippines", null, 63, R.drawable.ic_flag_ph),
    /**
     * Poland
     */
    PL("POL", "Poland", "Polska", 48, R.drawable.ic_flag_pl),
    /**
     * Portugal
     */
    PT("PRT", "Portugal", null, 351, R.drawable.ic_flag_pt),
    /**
     * Puerto Rico
     */
    PR("PRI", "Puerto Rico", null, 1, R.drawable.ic_flag_pr),
    /**
     * Qatar
     */
    QA("QAT", "Qatar", "\u202Bقطر\u202C\u200E", 974, R.drawable.ic_flag_qa),
    /**
     * Réunion
     */
    RE("REU", "Réunion", "La Réunion", 262, R.drawable.ic_flag_re),
    /**
     * Romania
     */
    RO("ROU", "Romania", "România", 40, R.drawable.ic_flag_ro),
    /**
     * Russia
     */
    RU("RUS", "Russia", "Россия", 7, R.drawable.ic_flag_ru),
    /**
     * Rwanda
     */
    RW("RWA", "Rwanda", null, 250, R.drawable.ic_flag_rw),
    /**
     * Saint Barthélemy
     */
    BL("BLM", "Saint Barthélemy", "Saint-Barthélemy", 590, R.drawable.ic_flag_fr),
    /**
     * Saint Helena
     */
    SH("SHN", "Saint Helena", null, 290, R.drawable.ic_flag_sh),
    /**
     * Saint Kitts and Nevis
     */
    KN("KNA", "Saint Kitts and Nevis", null, 1869, R.drawable.ic_flag_kn),
    /**
     * Saint Lucia
     */
    LC("LCA", "Saint Lucia", null, 1758, R.drawable.ic_flag_lc),
    /**
     * Saint Martin
     */
    MF("MAF", "Saint Martin", "Saint-Martin (partie française)", 590, R.drawable.ic_flag_mf),
    /**
     * Saint Pierre and Miquelon
     */
    PM("SPM", "Saint Pierre and Miquelon", "Saint-Pierre-et-Miquelon", 508, R.drawable.ic_flag_fr),
    /**
     * Saint Vincent and the Grenadines
     */
    VC("VCT", "Saint Vincent and the Grenadines", null, 1784, R.drawable.ic_flag_vc),
    /**
     * Samoa
     */
    WS("WSM", "Samoa", null, 685, R.drawable.ic_flag_ws),
    /**
     * San Marino
     */
    SM("SMR", "San Marino", null, 378, R.drawable.ic_flag_sm),
    /**
     * São Tomé and Príncipe
     */
    ST("STP", "São Tomé and Príncipe", "São Tomé e Príncipe", 239, R.drawable.ic_flag_st),
    /**
     * Saudi Arabia
     */
    SA("SAU", "Saudi Arabia", "\u202Bالمملكة العربية السعودية\u202C\u200E", 966, R.drawable.ic_flag_sa),
    /**
     * Senegal
     */
    SN("SEN", "Senegal", "Sénégal", 221, R.drawable.ic_flag_sn),
    /**
     * Serbia
     */
    RS("SRB", "Serbia", "Србија", 381, R.drawable.ic_flag_rs),
    /**
     * Seychelles
     */
    SC("SYC", "Seychelles", null, 248, R.drawable.ic_flag_sc),
    /**
     * Sierra Leone
     */
    SL("SLE", "Sierra Leone", null, 232, R.drawable.ic_flag_sl),
    /**
     * Singapore
     */
    SG("SGP", "Singapore", null, 65, R.drawable.ic_flag_sg),
    /**
     * Sint Maarten
     */
    SX("SXM", "Sint Maarten", null, 1721, R.drawable.ic_flag_mf),
    /**
     * Slovakia
     */
    SK("SVK", "Slovakia", "Slovensko", 421, R.drawable.ic_flag_sk),
    /**
     * Slovenia
     */
    SI("SVN", "Slovenia", "Slovenija", 386, R.drawable.ic_flag_si),
    /**
     * Solomon Islands
     */
    SB("SLB", "Solomon Islands", null, 677, R.drawable.ic_flag_sb),
    /**
     * Somalia
     */
    SO("SOM", "Somalia", "Soomaaliya", 252, R.drawable.ic_flag_so),
    /**
     * South Africa
     */
    ZA("ZAF", "South Africa", null, 27, R.drawable.ic_flag_za),
    /**
     * South Korea
     */
    KR("KOR", "South Korea", "대한민국", 82, R.drawable.ic_flag_kr),
    /**
     * South Sudan
     */
    SS("SSD", "South Sudan", "\u202Bجنوب السودان\u202C\u200E", 211, R.drawable.ic_flag_ss),
    /**
     * Spain
     */
    ES("ESP", "Spain", "España", 34, R.drawable.ic_flag_es),
    /**
     * Sri Lanka
     */
    LK("LKA", "Sri Lanka", "ශ්‍රී ලංකාව", 94, R.drawable.ic_flag_lk),
    /**
     * Sudan
     */
    SD("SDN", "Sudan", "\u202Bالسودان\u202C\u200E", 249, R.drawable.ic_flag_sd),
    /**
     * Suriname
     */
    SR("SUR", "Suriname", null, 597, R.drawable.ic_flag_sr),
    /**
     * Svalbard and Jan Mayen
     */
    SJ("SJM", "Svalbard and Jan Mayen", null, 47, R.drawable.ic_flag_no),
    /**
     * Swaziland
     */
    SZ("SWZ", "Swaziland", null, 268, R.drawable.ic_flag_sz),
    /**
     * Sweden
     */
    SE("SWE", "Sweden", "Sverige", 46, R.drawable.ic_flag_se),
    /**
     * Switzerland
     */
    CH("CHE", "Switzerland", "Schweiz", 41, R.drawable.ic_flag_ch),
    /**
     * Syria
     */
    SY("SYR", "Syria", "\u202Bسوريا\u202C\u200E", 963, R.drawable.ic_flag_sy),
    /**
     * Taiwan
     */
    TW("TWN", "Taiwan", "台灣", 886, R.drawable.ic_flag_tw),
    /**
     * Tajikistan
     */
    TJ("TJK", "Tajikistan", null, 992, R.drawable.ic_flag_tj),
    /**
     * Tanzania
     */
    TZ("TZA", "Tanzania", null, 255, R.drawable.ic_flag_tz),
    /**
     * Thailand
     */
    TH("THA", "Thailand", "ไทย", 66, R.drawable.ic_flag_th),
    /**
     * Timor-Leste
     */
    TL("TLS", "Timor-Leste", null, 670, R.drawable.ic_flag_tl),
    /**
     * Togo
     */
    TG("TGO", "Togo", null, 228, R.drawable.ic_flag_tg),
    /**
     * Tokelau
     */
    TK("TKL", "Tokelau", null, 690, R.drawable.ic_flag_tk),
    /**
     * Tonga
     */
    TO("TON", "Tonga", null, 676, R.drawable.ic_flag_to),
    /**
     * Trinidad and Tobago
     */
    TT("TTO", "Trinidad and Tobago", null, 1868, R.drawable.ic_flag_tt),
    /**
     * Tunisia
     */
    TN("TUN", "Tunisia", "\u202Bتونس\u202C\u200E", 216, R.drawable.ic_flag_tn),
    /**
     * Turkey
     */
    TR("TUR", "Turkey", "Türkiye", 90, R.drawable.ic_flag_tr),
    /**
     * Turkmenistan
     */
    TM("TKM", "Turkmenistan", null, 993, R.drawable.ic_flag_tm),
    /**
     * Turks and Caicos Islands
     */
    TC("TCA", "Turks and Caicos Islands", null, 1649, R.drawable.ic_flag_tc),
    /**
     * Tuvalu
     */
    TV("TUV", "Tuvalu", null, 688, R.drawable.ic_flag_tv),
    /**
     * U.S. Virgin Islands
     */
    VI("VIR", "U.S. Virgin Islands", null, 1340, R.drawable.ic_flag_vi),
    /**
     * Uganda
     */
    UG("UGA", "Uganda", null, 256, R.drawable.ic_flag_ug),
    /**
     * Ukraine
     */
    UA("UKR", "Ukraine", "Україна", 380, R.drawable.ic_flag_ua),
    /**
     * United Arab Emirates
     */
    AE("ARE", "United Arab Emirates", "\u202Bالإمارات العربية المتحدة\u202C\u200E", 971, R.drawable.ic_flag_ae),
    /**
     * United Kingdom
     */
    GB("GBR", "United Kingdom", null, 44, R.drawable.ic_flag_gb),
    /**
     * United States
     */
    US("USA", "United States", null, 1, R.drawable.ic_flag_us),
    /**
     * Uruguay
     */
    UY("URY", "Uruguay", null, 598, R.drawable.ic_flag_uy),
    /**
     * Uzbekistan
     */
    UZ("UZB", "Uzbekistan", "Oʻzbekiston", 998, R.drawable.ic_flag_uz),
    /**
     * Vanuatu
     */
    VU("VUT", "Vanuatu", null, 678, R.drawable.ic_flag_vu),
    /**
     * Vatican City
     */
    VA("VAT", "Vatican City", "Città del Vaticano", 39, R.drawable.ic_flag_va),
    /**
     * Venezuela
     */
    VE("VEN", "Venezuela", null, 58, R.drawable.ic_flag_ve),
    /**
     * Vietnam
     */
    VN("VNM", "Vietnam", "Việt Nam", 84, R.drawable.ic_flag_vn),
    /**
     * Wallis and Futuna
     */
    WF("WLF", "Wallis and Futuna", null, 681, R.drawable.ic_flag_fr),
    /**
     * Western Sahara
     */
    EH("ESH", "Western Sahara", "\u202Bالصحراء الغربية\u202C\u200E", 212, R.drawable.ic_flag_eh),
    /**
     * Yemen
     */
    YE("YEM", "Yemen", "\u202Bاليمن\u202C\u200E", 967, R.drawable.ic_flag_ye),
    /**
     * Zambia
     */
    ZM("ZMB", "Zambia", null, 260, R.drawable.ic_flag_zm),
    /**
     * Zimbabwe
     */
    ZW("ZWE", "Zimbabwe", null, 263, R.drawable.ic_flag_zw);

    /**
     * Country's alpha 2 name (e.g. IR)
     */
    public final String alpha2;

    /**
     * Country's alpha 3 name (e.g. IRN)
     */
    public final String alpha3;

    /**
     * Country's latin name (e.g. "Iran")
     */
    public final String latinName;

    /**
     * Country's internation phone prefix code
     */
    public final int code;

    /**
     * Country flag drawable resource id
     */
    @DrawableRes
    public final int flag;

    private final String localizedName;

    Country(final String a3, final String en, final String ln, final int intlCode, final @DrawableRes int icFlag) {
        if (intlCode <= 0) throw new IllegalArgumentException("country code prefix");
        if (null == a3 || a3.length() != 3) throw new IllegalArgumentException("Invalid Alpha3");

        alpha3 = a3;
        latinName = en;
        localizedName = ln;
        code = intlCode;
        flag = icFlag;
        alpha2 = name();
    }

    /**
     * Does this country have a localized name? (i.e. will calling {@link #localizedName()} return a different string than {@link #latinName}?
     * @return <code>true</code> if there is a localized name and <code>false</code> otehrwise.
     */
    public boolean hasLocalizedName() {
        return null != localizedName;
    }

    /**
     * Get the country's localized name (e.g. "ایران").
     *
     * @return localized name of the country or the latin name if no localized name is known.
     */
    public String localizedName() {
        return null == localizedName ? latinName : localizedName;
    }

    /**
     * Get a list of all countries sorted by their latin names
     * @return sorted list
     */
    public static Country[] sortedByLatinName () {
        final Country[] countries = values();

        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country left, Country right) {
                return left.latinName.compareToIgnoreCase(right.latinName);
            }
        });

        return countries;
    }

    /**
     * Get a list of all countries sorted by their Alpha2 code
     * @return sorted list
     */
    public static Country[] sortedByAlpha2 () {
        final Country[] countries = values();

        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country left, Country right) {
                return left.alpha2.compareToIgnoreCase(right.alpha2);
            }
        });

        return countries;
    }

    /**
     * Get a list of all countries sorted by their Alpha3 code
     * @return sorted list
     */
    public static Country[] sortedByAlpha3 () {
        final Country[] countries = values();

        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country left, Country right) {
                return left.alpha3.compareToIgnoreCase(right.alpha3);
            }
        });

        return countries;
    }
}

