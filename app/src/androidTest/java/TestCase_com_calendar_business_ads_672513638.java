import android.support.v7.widget.SearchView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calendar_business_ads_672513638 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SearchView.class);
      ((SearchView)var1).setQueryRefinementEnabled(true);
   }
}
