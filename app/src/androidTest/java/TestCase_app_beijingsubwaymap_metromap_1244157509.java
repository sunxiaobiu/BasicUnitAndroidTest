import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_beijingsubwaymap_metromap_1244157509 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ViewHolder.class);
      View var2 = ((ViewHolder)var1).itemView;
      LayoutParams var3 = var2.getLayoutParams();
      android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams var4 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)var3;
      var4.setFullSpan(true);
   }
}
