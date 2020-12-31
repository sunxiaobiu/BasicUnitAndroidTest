import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_nwt_letstrip__189261744 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(RecyclerView.class);
      LayoutManager var2 = ((RecyclerView)var1).getLayoutManager();
      StaggeredGridLayoutManager var3 = (StaggeredGridLayoutManager)var2;
      boolean var4 = var3.getReverseLayout();
   }
}
