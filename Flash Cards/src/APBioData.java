import java.util.ArrayList;

public class APBioData
	{
		static ArrayList<FlashCard> APFlashCards = new ArrayList<FlashCard>();

		public static void main(String[] args)
			{
				APBioData.loadData();
				System.out.println(APBioData.APFlashCards.get(0).getQuestion());
			}

		public static void loadData()
			{
				APFlashCards.add(new FlashCard("What is Primary Structure?",
						"First level of protein structure, Amino Acid Sequence"));
			}

	}
