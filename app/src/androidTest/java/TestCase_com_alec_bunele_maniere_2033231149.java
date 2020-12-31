import android.support.design.widget.CollapsingToolbarLayout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alec_bunele_maniere_2033231149 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(CollapsingToolbarLayout.class);
      long var1 = ((CollapsingToolbarLayout)var3).getScrimAnimationDuration();
   }
}
