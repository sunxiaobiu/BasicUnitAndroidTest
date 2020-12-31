import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView.LayoutManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DF14A066AFC86AAF014443B02EEA7326E96B9A18848F4C65702753A529C151E__313181522 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutManager.class);
      OrientationHelper var1 = OrientationHelper.createHorizontalHelper((LayoutManager)var2);
      var1 = OrientationHelper.createVerticalHelper((LayoutManager)var2);
      int var3 = var1.getEndAfterPadding();
   }
}
