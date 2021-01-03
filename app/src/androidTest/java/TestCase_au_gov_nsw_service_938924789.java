import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_nsw_service_938924789 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AttributeSet.class);
      String var1 = "android";
      ((AttributeSet)var2).getAttributeResourceValue((String)"android", var1, -1);
   }
}
