import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alsabbaq_alsabbaq__2113038121 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentManager.class);
      FragmentTransaction var3 = ((FragmentManager)var2).beginTransaction();
      String var1 = "android";
      var3.setBreadCrumbTitle(var1);
   }
}
