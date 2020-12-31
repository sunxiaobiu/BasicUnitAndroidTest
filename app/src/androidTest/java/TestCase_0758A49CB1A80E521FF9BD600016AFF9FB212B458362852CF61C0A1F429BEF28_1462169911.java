import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0758A49CB1A80E521FF9BD600016AFF9FB212B458362852CF61C0A1F429BEF28_1462169911 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextView.class);
      ViewParent var2 = ((TextView)var1).getParent();
      Toolbar var3 = (Toolbar)var2;
      CharSequence var4 = var3.getTitle();
   }
}
