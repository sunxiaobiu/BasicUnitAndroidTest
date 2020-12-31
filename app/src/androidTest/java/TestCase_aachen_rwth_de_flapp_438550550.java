import android.content.ContextWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_438550550 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ContextWrapper.class);
      String var2 = ((ContextWrapper)var1).getPackageCodePath();
   }
}
