import android.support.v7.widget.Toolbar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_android_AbcApplication_2082816748 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Toolbar.class);
      byte var1 = 1;
      ((Toolbar)var2).setNavigationContentDescription(var1);
   }
}
