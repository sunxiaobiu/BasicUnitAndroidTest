import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.Resolution;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2234AA29F1DFAFD71B7A45C48F9DEF211E279E84C0A60F94C07ACC591537C107_1380637892 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(Resolution.class);
      var2.setResolution((Resolution)var1);
   }
}
