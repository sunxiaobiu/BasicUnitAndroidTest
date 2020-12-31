import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TableRow;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_skyindya_skyindya_server_sweetzaria1__500434764 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Fragment.class);
      Object var1 = EasyMock.createMock(TableRow.class);
      ((Fragment)var2).registerForContextMenu((View)var1);
   }
}
