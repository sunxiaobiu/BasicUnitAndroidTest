import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andrewsoft_hobfarm_800515804 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppCompatTextView.class);
      Layout var2 = ((AppCompatTextView)var1).getLayout();
   }
}
