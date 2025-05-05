
public class Assignment_02_11 {

	public static boolean isAPrefix(String prefix, String s) {
		//It is really tempting to use the existing isAPrefix method of the class string....
		//Hopefully it is not too much trouble for you to use a loop instead?

		//my way of doing it ---------------------------

		// char _string[] = s.toCharArray();
		// char _prefix[] = prefix.toCharArray();
		// int truthPercentage = 0;
		// for (int i =0; i <prefix.length(); i++) 
		// {
		// 	if(_string[i] == _prefix[i])
		// 	{
		// 		truthPercentage += 1;
		// 	}
		// 	else
		// 	{
		// 		return false;
		// 	}
		// }
		// if(truthPercentage != 0)
		// {
		// 	return true;
		// }else{
		// 	return false;
		// }

		//asked way of doing it ----------------------------

		int prefixLength = prefix.length();

		if (prefixLength > s.length()) {
			return false;
		}

		for (int i = 0; i < prefixLength; i++) {
			if (prefix.charAt(i) != s.charAt(i)) {
				return false; 
			}
		}
		
		return true;
	}

	public static void main(String [] args) {
		System.out.println("Starting tests");
		if(isAPrefix("fu", "fuzzier") != true){
			System.err.println("Expected true for isAPrefix(fu, fuzzier)");
		}
		if(isAPrefix("mi1s9", "misfed") != false){
			System.err.println("Expected false for isAPrefix(mi1s9, misfed)");
		}
		if(isAPrefix("car4", "caravan") != false){
			System.err.println("Expected false for isAPrefix(car4, caravan)");
		}
		if(isAPrefix("eryNt8h6", "erythrosin") != false){
			System.err.println("Expected false for isAPrefix(eryNt8h6, erythrosin)");
		}
		if(isAPrefix("du", "dubiousnesses") != true){
			System.err.println("Expected true for isAPrefix(du, dubiousnesses)");
		}
		if(isAPrefix("mazo", "mazourka") != true){
			System.err.println("Expected true for isAPrefix(mazo, mazourka)");
		}
		if(isAPrefix("unre", "unreeved") != true){
			System.err.println("Expected true for isAPrefix(unre, unreeved)");
		}
		if(isAPrefix("snip", "snipers") != true){
			System.err.println("Expected true for isAPrefix(snip, snipers)");
		}
		if(isAPrefix("mig", "migraine") != true){
			System.err.println("Expected true for isAPrefix(mig, migraine)");
		}
		if(isAPrefix("aste", "asteroid") != true){
			System.err.println("Expected true for isAPrefix(aste, asteroid)");
		}
		if(isAPrefix("unb", "univocal") != false){
			System.err.println("Expected false for isAPrefix(unb, univocal)");
		}
		if(isAPrefix("pallaB", "palladia") != false){
			System.err.println("Expected false for isAPrefix(pallaB, palladia)");
		}
		if(isAPrefix("fillis", "fillisters") != true){
			System.err.println("Expected true for isAPrefix(fillis, fillisters)");
		}
		if(isAPrefix("majB", "majordomos") != false){
			System.err.println("Expected false for isAPrefix(majB, majordomos)");
		}
		if(isAPrefix("oscillog", "oscillographic") != true){
			System.err.println("Expected true for isAPrefix(oscillog, oscillographic)");
		}
		if(isAPrefix("tetrca8dDyEnc", "tetradynamous") != false){
			System.err.println("Expected false for isAPrefix(tetrca8dDyEnc, tetradynamous)");
		}
		if(isAPrefix("pejorastx", "pejoratives") != false){
			System.err.println("Expected false for isAPrefix(pejorastx, pejoratives)");
		}
		if(isAPrefix("ank", "anklets") != true){
			System.err.println("Expected true for isAPrefix(ank, anklets)");
		}
		if(isAPrefix("pattern", "patternless") != true){
			System.err.println("Expected true for isAPrefix(pattern, patternless)");
		}
		if(isAPrefix("t80avcSm", "t80avcSmsv3jLdw3quT") != true){
			System.err.println("Expected true for isAPrefix(t80avcSm, t80avcSmsv3jLdw3quT)");
		}
		if(isAPrefix("91N8", "91N8b2pLQQc1") != true){
			System.err.println("Expected true for isAPrefix(91N8, 91N8b2pLQQc1)");
		}
		if(isAPrefix("b3gy4Lr", "b3gy4LrDAK6EA1d") != true){
			System.err.println("Expected true for isAPrefix(b3gy4Lr, b3gy4LrDAK6EA1d)");
		}
		if(isAPrefix("98n", "98ZY6R885o") != false){
			System.err.println("Expected false for isAPrefix(98n, 98ZY6R885o)");
		}
		if(isAPrefix("inveiPgy", "inveigling") != false){
			System.err.println("Expected false for isAPrefix(inveiPgy, inveigling)");
		}
		if(isAPrefix("caWlulxoM", "calloses") != false){
			System.err.println("Expected false for isAPrefix(caWlulxoM, calloses)");
		}
		if(isAPrefix("tS1X6jp6BQ6x3IUEXBUl16", "tS1X6pB63UXU1a6c6wh") != false){
			System.err.println("Expected false for isAPrefix(tS1X6jp6BQ6x3IUEXBUl16, tS1X6pB63UXU1a6c6wh)");
		}
		if(isAPrefix("X8NA8s0n1y95F1t9g7ECnF9i4", "X8NA8s0ny5197CFi6ME") != false){
			System.err.println("Expected false for isAPrefix(X8NA8s0n1y95F1t9g7ECnF9i4, X8NA8s0ny5197CFi6ME)");
		}
		if(isAPrefix("reckR", "recklessly") != false){
			System.err.println("Expected false for isAPrefix(reckR, recklessly)");
		}
		if(isAPrefix("0mE", "0mEB4w7P1X") != true){
			System.err.println("Expected true for isAPrefix(0mE, 0mEB4w7P1X)");
		}
		if(isAPrefix("pi", "pisco") != true){
			System.err.println("Expected true for isAPrefix(pi, pisco)");
		}
		if(isAPrefix("dew", "deworming") != true){
			System.err.println("Expected true for isAPrefix(dew, deworming)");
		}
		if(isAPrefix("hayi0", "hailstone") != false){
			System.err.println("Expected false for isAPrefix(hayi0, hailstone)");
		}
		if(isAPrefix("oxys", "oxysalt") != true){
			System.err.println("Expected true for isAPrefix(oxys, oxysalt)");
		}
		if(isAPrefix("invh", "investors") != false){
			System.err.println("Expected false for isAPrefix(invh, investors)");
		}
		if(isAPrefix("nau", "naffs") != false){
			System.err.println("Expected false for isAPrefix(nau, naffs)");
		}
		if(isAPrefix("impond", "imponderability") != true){
			System.err.println("Expected true for isAPrefix(impond, imponderability)");
		}
		if(isAPrefix("ev", "evanishes") != true){
			System.err.println("Expected true for isAPrefix(ev, evanishes)");
		}
		if(isAPrefix("grutc", "grutched") != true){
			System.err.println("Expected true for isAPrefix(grutc, grutched)");
		}
		if(isAPrefix("W8qP54xxhm4YW", "W8qP54xxhm4YWepchI7") != true){
			System.err.println("Expected true for isAPrefix(W8qP54xxhm4YW, W8qP54xxhm4YWepchI7)");
		}
		if(isAPrefix("Ut7F61", "Ut7F61Yi0dInghMy55") != true){
			System.err.println("Expected true for isAPrefix(Ut7F61, Ut7F61Yi0dInghMy55)");
		}
		if(isAPrefix("coX", "corydalis") != false){
			System.err.println("Expected false for isAPrefix(coX, corydalis)");
		}
		if(isAPrefix("3AcOU1x9cW", "3AcOUxcBpQm026891q") != false){
			System.err.println("Expected false for isAPrefix(3AcOU1x9cW, 3AcOUxcBpQm026891q)");
		}
		if(isAPrefix("n3cB60H72d7Zdpe", "n3cB07dZp28I3") != false){
			System.err.println("Expected false for isAPrefix(n3cB60H72d7Zdpe, n3cB07dZp28I3)");
		}
		if(isAPrefix("p18b", "p18buMc72Y2rngxvBQ") != true){
			System.err.println("Expected true for isAPrefix(p18b, p18buMc72Y2rngxvBQ)");
		}
		if(isAPrefix("buz", "bututs") != false){
			System.err.println("Expected false for isAPrefix(buz, bututs)");
		}
		if(isAPrefix("ex", "expressway") != true){
			System.err.println("Expected true for isAPrefix(ex, expressway)");
		}
		if(isAPrefix("mRTd", "mRTcfMTV7z6") != false){
			System.err.println("Expected false for isAPrefix(mRTd, mRTcfMTV7z6)");
		}
		if(isAPrefix("sha4kP", "shakiness") != false){
			System.err.println("Expected false for isAPrefix(sha4kP, shakiness)");
		}
		if(isAPrefix("steaL", "stearin") != false){
			System.err.println("Expected false for isAPrefix(steaL, stearin)");
		}
		if(isAPrefix("inhe", "inheritances") != true){
			System.err.println("Expected true for isAPrefix(inhe, inheritances)");
		}
		if(isAPrefix("3lxu", "3lxrpVbLNl") != false){
			System.err.println("Expected false for isAPrefix(3lxu, 3lxrpVbLNl)");
		}
		if(isAPrefix("eucalypt", "eucalyptols") != true){
			System.err.println("Expected true for isAPrefix(eucalypt, eucalyptols)");
		}
		if(isAPrefix("5DxJem", "5DxJemE7Q7BW") != true){
			System.err.println("Expected true for isAPrefix(5DxJem, 5DxJemE7Q7BW)");
		}
		if(isAPrefix("sha", "shacklers") != true){
			System.err.println("Expected true for isAPrefix(sha, shacklers)");
		}
		if(isAPrefix("ca7", "calms") != false){
			System.err.println("Expected false for isAPrefix(ca7, calms)");
		}
		if(isAPrefix("MQ44sbm43", "MQ44b49JwQwYo") != false){
			System.err.println("Expected false for isAPrefix(MQ44sbm43, MQ44b49JwQwYo)");
		}
		if(isAPrefix("zin", "zincous") != true){
			System.err.println("Expected true for isAPrefix(zin, zincous)");
		}
		if(isAPrefix("6H4MC94fSU", "6H4MC94SSLXf") != false){
			System.err.println("Expected false for isAPrefix(6H4MC94fSU, 6H4MC94SSLXf)");
		}
		if(isAPrefix("come", "cometic") != true){
			System.err.println("Expected true for isAPrefix(come, cometic)");
		}
		if(isAPrefix("as", "assurers") != true){
			System.err.println("Expected true for isAPrefix(as, assurers)");
		}
		if(isAPrefix("bN6M0KZd", "bN6M0ZbHlp") != false){
			System.err.println("Expected false for isAPrefix(bN6M0KZd, bN6M0ZbHlp)");
		}
		if(isAPrefix("ma", "martyrizes") != true){
			System.err.println("Expected true for isAPrefix(ma, martyrizes)");
		}
		if(isAPrefix("fulfiy", "fulfilled") != false){
			System.err.println("Expected false for isAPrefix(fulfiy, fulfilled)");
		}
		if(isAPrefix("Lh18fg1vb", "Lh18fg1v6tgo") != false){
			System.err.println("Expected false for isAPrefix(Lh18fg1vb, Lh18fg1v6tgo)");
		}
		if(isAPrefix("05H24Q2", "052Q464z44H6RX") != false){
			System.err.println("Expected false for isAPrefix(05H24Q2, 052Q464z44H6RX)");
		}
		if(isAPrefix("infest", "infestants") != true){
			System.err.println("Expected true for isAPrefix(infest, infestants)");
		}
		if(isAPrefix("0WJA", "0WJA76a7Z1") != true){
			System.err.println("Expected true for isAPrefix(0WJA, 0WJA76a7Z1)");
		}
		if(isAPrefix("Z8c9G8TP", "Z8cGTDL28k8") != false){
			System.err.println("Expected false for isAPrefix(Z8c9G8TP, Z8cGTDL28k8)");
		}
		if(isAPrefix("inn1", "innovator") != false){
			System.err.println("Expected false for isAPrefix(inn1, innovator)");
		}
		if(isAPrefix("meAnatS", "mention") != false){
			System.err.println("Expected false for isAPrefix(meAnatS, mention)");
		}
		if(isAPrefix("RPT1TU0V", "RPT1TU0c4AWTD6mnIju") != false){
			System.err.println("Expected false for isAPrefix(RPT1TU0V, RPT1TU0c4AWTD6mnIju)");
		}
		if(isAPrefix("ySw6aHsG5409i76V01op1lXb8", "ySw6HG497V1plbq0ha") != false){
			System.err.println("Expected false for isAPrefix(ySw6aHsG5409i76V01op1lXb8, ySw6HG497V1plbq0ha)");
		}
		if(isAPrefix("un", "unseen") != true){
			System.err.println("Expected true for isAPrefix(un, unseen)");
		}
		if(isAPrefix("uncre", "uncreates") != true){
			System.err.println("Expected true for isAPrefix(uncre, uncreates)");
		}
		if(isAPrefix("suY", "subshaft") != false){
			System.err.println("Expected false for isAPrefix(suY, subshaft)");
		}
		if(isAPrefix("MXkLR2yW0z0P", "MXkLR2yW0z02pg0n") != false){
			System.err.println("Expected false for isAPrefix(MXkLR2yW0z0P, MXkLR2yW0z02pg0n)");
		}
		if(isAPrefix("020gnf2R", "020gnf2qH29f2oF") != false){
			System.err.println("Expected false for isAPrefix(020gnf2R, 020gnf2qH29f2oF)");
		}
		if(isAPrefix("0Du", "0DtOV5IqPk3Nt3y95") != false){
			System.err.println("Expected false for isAPrefix(0Du, 0DtOV5IqPk3Nt3y95)");
		}
		if(isAPrefix("undergird", "undergirding") != true){
			System.err.println("Expected true for isAPrefix(undergird, undergirding)");
		}
		if(isAPrefix("tyk", "tyes") != false){
			System.err.println("Expected false for isAPrefix(tyk, tyes)");
		}
		if(isAPrefix("44n0fsl48", "440s42r5mGe") != false){
			System.err.println("Expected false for isAPrefix(44n0fsl48, 440s42r5mGe)");
		}
		if(isAPrefix("m9r2sr2x52L99DV", "m9r2sr2x52L99D4jX") != false){
			System.err.println("Expected false for isAPrefix(m9r2sr2x52L99DV, m9r2sr2x52L99D4jX)");
		}
		if(isAPrefix("x3v05G42", "x3v05G42Wc3c") != true){
			System.err.println("Expected true for isAPrefix(x3v05G42, x3v05G42Wc3c)");
		}
		if(isAPrefix("biW", "bills") != false){
			System.err.println("Expected false for isAPrefix(biW, bills)");
		}
		if(isAPrefix("7W0", "7WNC4YbyG0Y9") != false){
			System.err.println("Expected false for isAPrefix(7W0, 7WNC4YbyG0Y9)");
		}
		if(isAPrefix("tiFty", "titivate") != false){
			System.err.println("Expected false for isAPrefix(tiFty, titivate)");
		}
		if(isAPrefix("2V4C6", "2VC6Rh7p5uuBsjrhg") != false){
			System.err.println("Expected false for isAPrefix(2V4C6, 2VC6Rh7p5uuBsjrhg)");
		}
		if(isAPrefix("stq", "stravages") != false){
			System.err.println("Expected false for isAPrefix(stq, stravages)");
		}
		if(isAPrefix("sctoa", "scours") != false){
			System.err.println("Expected false for isAPrefix(sctoa, scours)");
		}
		if(isAPrefix("si", "simlins") != true){
			System.err.println("Expected true for isAPrefix(si, simlins)");
		}
		if(isAPrefix("K7mA", "K7mAjS65NYN1sZY") != true){
			System.err.println("Expected true for isAPrefix(K7mA, K7mAjS65NYN1sZY)");
		}
		if(isAPrefix("eB407coz", "eB407coz2KX6M8") != true){
			System.err.println("Expected true for isAPrefix(eB407coz, eB407coz2KX6M8)");
		}
		if(isAPrefix("cl7eR", "clepsydra") != false){
			System.err.println("Expected false for isAPrefix(cl7eR, clepsydra)");
		}
		if(isAPrefix("lacqqa", "lacquerworks") != false){
			System.err.println("Expected false for isAPrefix(lacqqa, lacquerworks)");
		}
		if(isAPrefix("lumb0", "lumbagos") != false){
			System.err.println("Expected false for isAPrefix(lumb0, lumbagos)");
		}
		if(isAPrefix("g75E1CTBQy6u1L62x", "g75E1CTByuL2YXuU2") != false){
			System.err.println("Expected false for isAPrefix(g75E1CTBQy6u1L62x, g75E1CTByuL2YXuU2)");
		}
		if(isAPrefix("kel", "keloidal") != true){
			System.err.println("Expected true for isAPrefix(kel, keloidal)");
		}
		if(isAPrefix("Ko", "KoYUNK7g4s1Q7Zxqk") != true){
			System.err.println("Expected true for isAPrefix(Ko, KoYUNK7g4s1Q7Zxqk)");
		}
		if(isAPrefix("photoZecn0g9rZ", "photoengraver") != false){
			System.err.println("Expected false for isAPrefix(photoZecn0g9rZ, photoengraver)");
		}
		if(isAPrefix("ov0", "overexciting") != false){
			System.err.println("Expected false for isAPrefix(ov0, overexciting)");
		}
		if(isAPrefix("92U3p", "92U3pucfrS8f7UTL") != true){
			System.err.println("Expected true for isAPrefix(92U3p, 92U3pucfrS8f7UTL)");
		}
		if(isAPrefix("xk39V242T8wJI", "xk39V242T8wJItLmNx") != true){
			System.err.println("Expected true for isAPrefix(xk39V242T8wJI, xk39V242T8wJItLmNx)");
		}
		if(isAPrefix("fen", "fencerow") != true){
			System.err.println("Expected true for isAPrefix(fen, fencerow)");
		}
		if(isAPrefix("sac0r8aG", "sacrarial") != false){
			System.err.println("Expected false for isAPrefix(sac0r8aG, sacrarial)");
		}
		if(isAPrefix("wrUXR17N2", "wrUXR17N2YIA41") != true){
			System.err.println("Expected true for isAPrefix(wrUXR17N2, wrUXR17N2YIA41)");
		}
		if(isAPrefix("PT046", "PT0480foUE") != false){
			System.err.println("Expected false for isAPrefix(PT046, PT0480foUE)");
		}
		if(isAPrefix("jhW9fz4M73", "jhW9fz4M73Kh5kvxZ3S") != true){
			System.err.println("Expected true for isAPrefix(jhW9fz4M73, jhW9fz4M73Kh5kvxZ3S)");
		}
		if(isAPrefix("8i20g4mz53prA", "8i20g4mz3rUglxw5l9W") != false){
			System.err.println("Expected false for isAPrefix(8i20g4mz53prA, 8i20g4mz3rUglxw5l9W)");
		}
		if(isAPrefix("scal7", "scalares") != false){
			System.err.println("Expected false for isAPrefix(scal7, scalares)");
		}
		if(isAPrefix("decel", "decelerating") != true){
			System.err.println("Expected true for isAPrefix(decel, decelerating)");
		}
		if(isAPrefix("reixnE", "reinstates") != false){
			System.err.println("Expected false for isAPrefix(reixnE, reinstates)");
		}
		if(isAPrefix("9IOQ6e", "9IO6FOt95Z") != false){
			System.err.println("Expected false for isAPrefix(9IOQ6e, 9IO6FOt95Z)");
		}
		if(isAPrefix("K8dRu", "K8dRuxA3Jk") != true){
			System.err.println("Expected true for isAPrefix(K8dRu, K8dRuxA3Jk)");
		}
		if(isAPrefix("u5A7Gd456p", "u5A7Gd46WBh") != false){
			System.err.println("Expected false for isAPrefix(u5A7Gd456p, u5A7Gd46WBh)");
		}
		if(isAPrefix("015P8nxe62n", "015P8nxe2c0E") != false){
			System.err.println("Expected false for isAPrefix(015P8nxe62n, 015P8nxe2c0E)");
		}
		if(isAPrefix("w89997LyP6", "w89LPA84MDRQ70C627") != false){
			System.err.println("Expected false for isAPrefix(w89997LyP6, w89LPA84MDRQ70C627)");
		}
		if(isAPrefix("mult1i2", "multinomial") != false){
			System.err.println("Expected false for isAPrefix(mult1i2, multinomial)");
		}
		if(isAPrefix("tes2sNeS", "tessellations") != false){
			System.err.println("Expected false for isAPrefix(tes2sNeS, tessellations)");
		}
		if(isAPrefix("Sxa9bA43Bz", "Sxa9bA43BzFCx62") != true){
			System.err.println("Expected true for isAPrefix(Sxa9bA43Bz, Sxa9bA43BzFCx62)");
		}
		if(isAPrefix("jsgIRt2R1oUxdM0a", "jsgIRt2R1oUd0b9y") != false){
			System.err.println("Expected false for isAPrefix(jsgIRt2R1oUxdM0a, jsgIRt2R1oUd0b9y)");
		}
		if(isAPrefix("23ZoJPKX1GKBC13N0a96v", "23oPXGB1Na68ZHSgc") != false){
			System.err.println("Expected false for isAPrefix(23ZoJPKX1GKBC13N0a96v, 23oPXGB1Na68ZHSgc)");
		}
		if(isAPrefix("sDx", "sDU8hDkFicyrNP12i") != false){
			System.err.println("Expected false for isAPrefix(sDx, sDU8hDkFicyrNP12i)");
		}
		if(isAPrefix("rat", "ratsbanes") != true){
			System.err.println("Expected true for isAPrefix(rat, ratsbanes)");
		}
		if(isAPrefix("impersona", "impersonates") != true){
			System.err.println("Expected true for isAPrefix(impersona, impersonates)");
		}
		if(isAPrefix("6QA5K", "6QA5vdoLwBf8MY1x") != false){
			System.err.println("Expected false for isAPrefix(6QA5K, 6QA5vdoLwBf8MY1x)");
		}
		if(isAPrefix("2f8PBU3l08pn", "2f8B30pteE3GFQH") != false){
			System.err.println("Expected false for isAPrefix(2f8PBU3l08pn, 2f8B30pteE3GFQH)");
		}
		if(isAPrefix("r1YzzG3T", "r1YzzG3ToG7G") != true){
			System.err.println("Expected true for isAPrefix(r1YzzG3T, r1YzzG3ToG7G)");
		}
		if(isAPrefix("ka", "kainite") != true){
			System.err.println("Expected true for isAPrefix(ka, kainite)");
		}
		if(isAPrefix("duel", "duelers") != true){
			System.err.println("Expected true for isAPrefix(duel, duelers)");
		}
		if(isAPrefix("108k5", "10kwT6bv2Vi29ZVn") != false){
			System.err.println("Expected false for isAPrefix(108k5, 10kwT6bv2Vi29ZVn)");
		}
		if(isAPrefix("wqycU7", "wqycUy26h5gBYgAVEO") != false){
			System.err.println("Expected false for isAPrefix(wqycU7, wqycUy26h5gBYgAVEO)");
		}
		if(isAPrefix("2H", "2H85V6JDySzPka87") != true){
			System.err.println("Expected true for isAPrefix(2H, 2H85V6JDySzPka87)");
		}
		if(isAPrefix("superc", "supercluster") != true){
			System.err.println("Expected true for isAPrefix(superc, supercluster)");
		}
		if(isAPrefix("un", "unpersuasive") != true){
			System.err.println("Expected true for isAPrefix(un, unpersuasive)");
		}
		if(isAPrefix("barrAaO", "barranca") != false){
			System.err.println("Expected false for isAPrefix(barrAaO, barranca)");
		}
		if(isAPrefix("471GFvq", "471GFvlk530xFke") != false){
			System.err.println("Expected false for isAPrefix(471GFvq, 471GFvlk530xFke)");
		}
		if(isAPrefix("nekaL", "neatens") != false){
			System.err.println("Expected false for isAPrefix(nekaL, neatens)");
		}
		if(isAPrefix("affmi0re", "affirmation") != false){
			System.err.println("Expected false for isAPrefix(affmi0re, affirmation)");
		}
		if(isAPrefix("q1yRvz4F41H", "q1yRvz4F41H6QKy") != true){
			System.err.println("Expected true for isAPrefix(q1yRvz4F41H, q1yRvz4F41H6QKy)");
		}
		if(isAPrefix("alw", "alicyclic") != false){
			System.err.println("Expected false for isAPrefix(alw, alicyclic)");
		}
		if(isAPrefix("hypZ", "hyperostotic") != false){
			System.err.println("Expected false for isAPrefix(hypZ, hyperostotic)");
		}
		if(isAPrefix("08s34EaUr8", "08s4arOEqce") != false){
			System.err.println("Expected false for isAPrefix(08s34EaUr8, 08s4arOEqce)");
		}
		if(isAPrefix("3h736zl662", "3h736zl638044rNb13X") != false){
			System.err.println("Expected false for isAPrefix(3h736zl662, 3h736zl638044rNb13X)");
		}
		if(isAPrefix("qT7", "qT7M2cogMP7599LvNJ") != true){
			System.err.println("Expected true for isAPrefix(qT7, qT7M2cogMP7599LvNJ)");
		}
		if(isAPrefix("ba", "bathmats") != true){
			System.err.println("Expected true for isAPrefix(ba, bathmats)");
		}
		if(isAPrefix("2wVK", "2wVKd6dPNTl9evXy1") != true){
			System.err.println("Expected true for isAPrefix(2wVK, 2wVKd6dPNTl9evXy1)");
		}
		if(isAPrefix("0o46JJ1943kU6557TI", "0o46J93U5T988jfjr3n") != false){
			System.err.println("Expected false for isAPrefix(0o46JJ1943kU6557TI, 0o46J93U5T988jfjr3n)");
		}
		if(isAPrefix("carp", "carpool") != true){
			System.err.println("Expected true for isAPrefix(carp, carpool)");
		}
		if(isAPrefix("7L", "7L624F5oV0WLY") != true){
			System.err.println("Expected true for isAPrefix(7L, 7L624F5oV0WLY)");
		}
		if(isAPrefix("ca", "cardon") != true){
			System.err.println("Expected true for isAPrefix(ca, cardon)");
		}
		if(isAPrefix("ZcF", "ZcF8t5kLX1PQr") != true){
			System.err.println("Expected true for isAPrefix(ZcF, ZcF8t5kLX1PQr)");
		}
		if(isAPrefix("kpAg", "kpAg70k1w6fe") != true){
			System.err.println("Expected true for isAPrefix(kpAg, kpAg70k1w6fe)");
		}
		if(isAPrefix("panm", "pancreatins") != false){
			System.err.println("Expected false for isAPrefix(panm, pancreatins)");
		}
		if(isAPrefix("reliN", "relives") != false){
			System.err.println("Expected false for isAPrefix(reliN, relives)");
		}
		if(isAPrefix("3yo9f66", "3yo9f662q11fWCe9at") != true){
			System.err.println("Expected true for isAPrefix(3yo9f66, 3yo9f662q11fWCe9at)");
		}
		if(isAPrefix("N23Rpe", "N23Rpe6VUrht49") != true){
			System.err.println("Expected true for isAPrefix(N23Rpe, N23Rpe6VUrht49)");
		}
		if(isAPrefix("t9h61J", "t9h61JLpN1B9N4uYu9p") != true){
			System.err.println("Expected true for isAPrefix(t9h61J, t9h61JLpN1B9N4uYu9p)");
		}
		if(isAPrefix("hatc", "hatchments") != true){
			System.err.println("Expected true for isAPrefix(hatc, hatchments)");
		}
		if(isAPrefix("4GIgL470V9", "4GIL7VJx4tF7Z") != false){
			System.err.println("Expected false for isAPrefix(4GIgL470V9, 4GIL7VJx4tF7Z)");
		}
		if(isAPrefix("auspCin", "auspices") != false){
			System.err.println("Expected false for isAPrefix(auspCin, auspices)");
		}
		if(isAPrefix("tub4e1", "tubeless") != false){
			System.err.println("Expected false for isAPrefix(tub4e1, tubeless)");
		}
		if(isAPrefix("Z6T9oM4wvT", "Z6To4vwt81zp8B") != false){
			System.err.println("Expected false for isAPrefix(Z6T9oM4wvT, Z6To4vwt81zp8B)");
		}
		if(isAPrefix("8qV4g84", "8qV4g846wL") != true){
			System.err.println("Expected true for isAPrefix(8qV4g84, 8qV4g846wL)");
		}
		if(isAPrefix("qE", "qEc0b9L2JrM32e5") != true){
			System.err.println("Expected true for isAPrefix(qE, qEc0b9L2JrM32e5)");
		}
		if(isAPrefix("epita", "epitaphial") != true){
			System.err.println("Expected true for isAPrefix(epita, epitaphial)");
		}
		if(isAPrefix("8tV", "8tVej6DCjVkz99R") != true){
			System.err.println("Expected true for isAPrefix(8tV, 8tVej6DCjVkz99R)");
		}
		if(isAPrefix("trc", "truckmaster") != false){
			System.err.println("Expected false for isAPrefix(trc, truckmaster)");
		}
		if(isAPrefix("B7AjgEG1PzvH", "B7AjgEG1Pzv97jhJ0") != false){
			System.err.println("Expected false for isAPrefix(B7AjgEG1PzvH, B7AjgEG1Pzv97jhJ0)");
		}
		if(isAPrefix("e143", "e1410ftC414z05S63") != false){
			System.err.println("Expected false for isAPrefix(e143, e1410ftC414z05S63)");
		}
		if(isAPrefix("F1yHrW1", "F1yHrW14GB7E6J") != true){
			System.err.println("Expected true for isAPrefix(F1yHrW1, F1yHrW14GB7E6J)");
		}
		if(isAPrefix("5xjYo1LQ3", "5xjYo1LQ5CTtC") != false){
			System.err.println("Expected false for isAPrefix(5xjYo1LQ3, 5xjYo1LQ5CTtC)");
		}
		if(isAPrefix("monmo4p6hnaK", "monophagous") != false){
			System.err.println("Expected false for isAPrefix(monmo4p6hnaK, monophagous)");
		}
		if(isAPrefix("J7Mpjbd0", "J7Mpjbd041fYA33u0L") != true){
			System.err.println("Expected true for isAPrefix(J7Mpjbd0, J7Mpjbd041fYA33u0L)");
		}
		if(isAPrefix("aSysraf3Y", "aSysraf3YuEM0Dhk") != true){
			System.err.println("Expected true for isAPrefix(aSysraf3Y, aSysraf3YuEM0Dhk)");
		}
		if(isAPrefix("y1jWP", "y1jWPB70276026NcfZ") != true){
			System.err.println("Expected true for isAPrefix(y1jWP, y1jWPB70276026NcfZ)");
		}
		if(isAPrefix("2HY4Vh38", "2HY4V3ioRj4F9") != false){
			System.err.println("Expected false for isAPrefix(2HY4Vh38, 2HY4V3ioRj4F9)");
		}
		if(isAPrefix("nVhngaQX", "nVhngQ0BP42608S29") != false){
			System.err.println("Expected false for isAPrefix(nVhngaQX, nVhngQ0BP42608S29)");
		}
		if(isAPrefix("v0Ze93wYlNy6de5sh3P2QOtYLuJ4", "v0Z9wlyd5hPQtLJ3pt") != false){
			System.err.println("Expected false for isAPrefix(v0Ze93wYlNy6de5sh3P2QOtYLuJ4, v0Z9wlyd5hPQtLJ3pt)");
		}
		if(isAPrefix("B065uUO", "B065UV748p") != false){
			System.err.println("Expected false for isAPrefix(B065uUO, B065UV748p)");
		}
		if(isAPrefix("reF", "reserviced") != false){
			System.err.println("Expected false for isAPrefix(reF, reserviced)");
		}
		if(isAPrefix("pren", "prenotification") != true){
			System.err.println("Expected true for isAPrefix(pren, prenotification)");
		}
		if(isAPrefix("spOo1", "spotter") != false){
			System.err.println("Expected false for isAPrefix(spOo1, spotter)");
		}
		if(isAPrefix("moEr8aklF", "moralising") != false){
			System.err.println("Expected false for isAPrefix(moEr8aklF, moralising)");
		}
		if(isAPrefix("finan", "financial") != true){
			System.err.println("Expected true for isAPrefix(finan, financial)");
		}
		if(isAPrefix("fRbL4Y", "fRbL4Ypg60O8T") != true){
			System.err.println("Expected true for isAPrefix(fRbL4Y, fRbL4Ypg60O8T)");
		}
		if(isAPrefix("shab0bp", "shabbiest") != false){
			System.err.println("Expected false for isAPrefix(shab0bp, shabbiest)");
		}
		if(isAPrefix("298gUL9d8Q5fkmeO7P", "298gUL985ke7oGc") != false){
			System.err.println("Expected false for isAPrefix(298gUL9d8Q5fkmeO7P, 298gUL985ke7oGc)");
		}
		if(isAPrefix("0KmKY", "0KmKYHdix2C529dq") != true){
			System.err.println("Expected true for isAPrefix(0KmKY, 0KmKYHdix2C529dq)");
		}
		if(isAPrefix("unreminis", "unreminiscent") != true){
			System.err.println("Expected true for isAPrefix(unreminis, unreminiscent)");
		}
		if(isAPrefix("beE", "bewitched") != false){
			System.err.println("Expected false for isAPrefix(beE, bewitched)");
		}
		if(isAPrefix("71Kg", "71KU9sqXqC") != false){
			System.err.println("Expected false for isAPrefix(71Kg, 71KU9sqXqC)");
		}
		if(isAPrefix("ZhnP1o8x82Q", "ZhnP1o8x82QhtrQ5l") != true){
			System.err.println("Expected true for isAPrefix(ZhnP1o8x82Q, ZhnP1o8x82QhtrQ5l)");
		}
		if(isAPrefix("ce", "cerebroside") != true){
			System.err.println("Expected true for isAPrefix(ce, cerebroside)");
		}
		if(isAPrefix("Y73681L5", "Y73681L52lhwx") != true){
			System.err.println("Expected true for isAPrefix(Y73681L5, Y73681L52lhwx)");
		}
		if(isAPrefix("iF1", "iF1aNGYI734") != true){
			System.err.println("Expected true for isAPrefix(iF1, iF1aNGYI734)");
		}
		if(isAPrefix("4TW2iHk77y91", "4TW2iHk79W265U") != false){
			System.err.println("Expected false for isAPrefix(4TW2iHk77y91, 4TW2iHk79W265U)");
		}
		if(isAPrefix("5N7", "5Na8pkIXVS26L") != false){
			System.err.println("Expected false for isAPrefix(5N7, 5Na8pkIXVS26L)");
		}
		if(isAPrefix("255P5", "255P5Ot94sL5HMS") != true){
			System.err.println("Expected true for isAPrefix(255P5, 255P5Ot94sL5HMS)");
		}
		if(isAPrefix("Pap95913KBYtu6UsA6a", "Pap9593Bt6s6h7Q4") != false){
			System.err.println("Expected false for isAPrefix(Pap95913KBYtu6UsA6a, Pap9593Bt6s6h7Q4)");
		}
		if(isAPrefix("ZJJzo0Cj31EM", "ZJJzo0C3E93V") != false){
			System.err.println("Expected false for isAPrefix(ZJJzo0Cj31EM, ZJJzo0C3E93V)");
		}
		if(isAPrefix("91FfkHHp4F234l4uSLg7", "91FfkHH4244Sg2q9yhi") != false){
			System.err.println("Expected false for isAPrefix(91FfkHHp4F234l4uSLg7, 91FfkHH4244Sg2q9yhi)");
		}
		if(isAPrefix("fl", "flong") != true){
			System.err.println("Expected true for isAPrefix(fl, flong)");
		}
		if(isAPrefix("fi", "fiberize") != true){
			System.err.println("Expected true for isAPrefix(fi, fiberize)");
		}
		if(isAPrefix("UT009fCv", "UT009fCvXC63zRXXM") != true){
			System.err.println("Expected true for isAPrefix(UT009fCv, UT009fCvXC63zRXXM)");
		}
		if(isAPrefix("ZzMhjCV7vFGzY", "ZzMhjCV7vFGzYFEp1") != true){
			System.err.println("Expected true for isAPrefix(ZzMhjCV7vFGzY, ZzMhjCV7vFGzYFEp1)");
		}
		if(isAPrefix("pkLo8", "pkLo8b2mSQu") != true){
			System.err.println("Expected true for isAPrefix(pkLo8, pkLo8b2mSQu)");
		}
		if(isAPrefix("boknF", "bonfire") != false){
			System.err.println("Expected false for isAPrefix(boknF, bonfire)");
		}
		if(isAPrefix("hit", "hitless") != true){
			System.err.println("Expected true for isAPrefix(hit, hitless)");
		}
		if(isAPrefix("asse", "assessment") != true){
			System.err.println("Expected true for isAPrefix(asse, assessment)");
		}
		if(isAPrefix("forbneGa2", "forbearing") != false){
			System.err.println("Expected false for isAPrefix(forbneGa2, forbearing)");
		}
		if(isAPrefix("bli8m7", "blimpish") != false){
			System.err.println("Expected false for isAPrefix(bli8m7, blimpish)");
		}
		if(isAPrefix("Mq4eSpeIe82", "MqepI8teX0yKF1uhw4") != false){
			System.err.println("Expected false for isAPrefix(Mq4eSpeIe82, MqepI8teX0yKF1uhw4)");
		}
		if(isAPrefix("bobber", "bobberies") != true){
			System.err.println("Expected true for isAPrefix(bobber, bobberies)");
		}
		if(isAPrefix("rheho7s2t2", "rheostats") != false){
			System.err.println("Expected false for isAPrefix(rheho7s2t2, rheostats)");
		}
		if(isAPrefix("19Zb80Y3", "19Zb80Y3oVkS6gRCe") != true){
			System.err.println("Expected true for isAPrefix(19Zb80Y3, 19Zb80Y3oVkS6gRCe)");
		}
		if(isAPrefix("cu", "cuttings") != true){
			System.err.println("Expected true for isAPrefix(cu, cuttings)");
		}
		if(isAPrefix("7FoTo976", "7FoTo9765FC9iI") != true){
			System.err.println("Expected true for isAPrefix(7FoTo976, 7FoTo9765FC9iI)");
		}
		if(isAPrefix("96j", "96NqUx7GxRA1YX2Ww") != false){
			System.err.println("Expected false for isAPrefix(96j, 96NqUx7GxRA1YX2Ww)");
		}
		if(isAPrefix("gue", "guesstimates") != true){
			System.err.println("Expected true for isAPrefix(gue, guesstimates)");
		}
		System.out.println("Ending tests:  No red output in eclipse means success");
	}
}