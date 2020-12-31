import android.content.ContextWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bloomberg_android_plus_581452589 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContextWrapper.class);
      String var1 = "android";
      ((ContextWrapper)var2).getFileStreamPath(var1);
   }
}
