import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DF14A066AFC86AAF014443B02EEA7326E96B9A18848F4C65702753A529C151E__2128493723 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LayoutManager.class);
      OrientationHelper var2 = OrientationHelper.createHorizontalHelper((LayoutManager)var1);
      var2 = OrientationHelper.createVerticalHelper((LayoutManager)var1);
      var1 = EasyMock.createMock(View.class);
      var2.getDecoratedStart((View)var1);
   }
}
