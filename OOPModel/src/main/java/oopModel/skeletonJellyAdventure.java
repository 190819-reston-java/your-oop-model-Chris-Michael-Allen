package oopModel;

import java.util.concurrent.ThreadLocalRandom;

public class skeletonJellyAdventure {

	public static void main(String[] args) {
		System.out.println("     ---   .    ____        -----      ______   -----        .\r\n" + 
				"  ___     / \\             .....................      ____   / \\\r\n" + 
				"        .'   '.  --  ..:::::''''''''''''''''':::::..      .'   '.\r\n" + 
				"  ---   | ^ ^ |    .::::''''          (_     ''''::::. -- | ^ ^ '\r\n" + 
				"        | ^ ^ |  .::''                       _)    ''::.  | ^ ^ | --\r\n" + 
				"____     '...'  .::'              .-.      (_        '::.  '...'\r\n" + 
				"        .-.!_  .::'       _)     /   \\                '::.   ! ____\r\n" + 
				"       / / `-`.:'                '-.-'            _)    ':..\"\"\".\r\n" + 
				" --    ' |  '.|:'      _)         .'.       (_          ':/' |  \\\r\n" + 
				"       | |   |'.               _/^---^\\_                  |     . --\r\n" + 
				" ___    \\ .  '|               \\-------../         (_      \\   '.'\r\n" + 
				"        ' :   '        _)      '.\\:::/.'       (_   )_    |'   || ___\r\n" + 
				"        | |  .|      _(         | | |'|                   / ' . |\r\n" + 
				"    --  | '. | \\                '.\\ /.'                   '.  | |--\r\n" + 
				"        |'.   '|                 |[ ]|           (_       | .'  |____\r\n" + 
				"__    .'\\ |  .'\\                 '.^.'                    \\ |.  .\r\n" + 
				"     .'-.\\'. | |        _)        (:)                     | ||| |\r\n" + 
				"   .'    \\'..' .             _..--'''--.._      (_       /'-._.-'| ---\r\n" + 
				"   |       `-..'.         .-'             '-.           |      .-'.\r\n" + 
				"    \\            `-.    .'  ..            .. '.        .'-._.-'    `.\r\n" + 
				"--   )              `-./    '::.        .::'   \\   _.-'             /\r\n" + 
				"     '._/-..          /       '::.    .::'      \\-'              .-'\r\n" + 
				"         ::.`-.      ''        '::   ::'        ''       _..-\\_.'\r\n" + 
				"         :::   '._   | \\         '   '         / |    .-'   .:: _____\r\n" + 
				"____     :::      `-.|  '  .----..___..----.  '  | .-'      :::\r\n" + 
				"         :::          \\ |  _..--.     .--.._  | /-'         ::: ---\r\n" + 
				"         :::   _)     | ' /     |     |     \\ ' |  (        :::\r\n" + 
				"   --    :::          )   |   _.'     '._   |   (   )_      :::____\r\n" + 
				"    ____ :::          /'. \\_.'   )\\ /(   '._/ .'\\     (_    :::\r\n" + 
				"         :::       .-'|  `-->-@ /     \\ @->--'  |-.         :::\r\n" + 
				"         :::    .-'   \\         | / \\ |         /  `-.      :::  ---\r\n" + 
				" ----    '' _.-'       |        )/   \\(        |      `-.   :::  _____\r\n" + 
				"  _.-=--..-'          . \\ /\\               /\\ /          `-. ''\r\n" + 
				" /.._    `.        .-'   .\\ '-.\\.\\\\.//./.-' /.`-.           `---.._\r\n" + 
				"|    `.    \\    .-'      | '.             .' |   `-.                \\ \r\n" + 
				" \\    _\\.   `.-'         |   '-././.\\.\\.-'   |      `.               |\r\n" + 
				"  `.-'  |   /::::::::::: \\                   /::::::::`.      ,-.    /\r\n" + 
				" - |   /   /        ----  '-.             .-'     ----  `.    |  \\_.'\r\n" + 
				"__ \\   | .'     _____        '-._._._._.-'     ____      |    |   |\r\n" + 
				"    `--'                                                 `-.  '._ / --\r\n" + 
				"                                                            `...-'");
		skeletonJelly myJelly = new skeletonJelly("Skeleton Jelly", 20);
		squirxicalJelly secondJelly = new squirxicalJelly("Squirxical Jelly");
		
		myJelly.Speak();
		secondJelly.Speak();
		
		secondJelly.Drip();
		secondJelly.Drip();
		
		myJelly.isCareful();
		secondJelly.isCareful();
		
		squirxicalJelly thirdJelly = new squirxicalJelly("Skeleton Jelly", 50);
		thirdJelly.isCareful();

		int jelly_flock_count = ThreadLocalRandom.current().nextInt(50, 52);
		skeletonJellyFlock newFlock = null;
		
		try {
			newFlock = new skeletonJellyFlock(jelly_flock_count);
		} catch (TooFewBonesException e) {
			e.printStackTrace();
		}
		
		newFlock.releaseTheFlock();
	}

}
