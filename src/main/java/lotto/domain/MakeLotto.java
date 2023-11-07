package lotto.domain;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MakeLotto {
  public MakeLotto() {

  }
  private static final int COUNT = 6;
  private static final int MIN_LOTTO_NUMBER = 1;
  private static final int MAX_LOTTO_NUMBER = 45;
  private static List<Integer> lottoNumberList;
  public static List<Integer> makeLotto() {
    lottoNumberList = Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER, COUNT);
    List<Integer> lottoTicketNumberList = new ArrayList<>(lottoNumberList);
    Collections.sort(lottoTicketNumberList);
    return lottoTicketNumberList;
  }
}
