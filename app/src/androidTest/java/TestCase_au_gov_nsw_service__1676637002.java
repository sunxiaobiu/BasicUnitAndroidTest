import android.support.v7.widget.Toolbar;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_nsw_service__1676637002 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextView.class);
      ViewParent var2 = ((TextView)var1).getParent();
      Toolbar var3 = (Toolbar)var2;
      CharSequence var4 = var3.getSubtitle();
   }
}
