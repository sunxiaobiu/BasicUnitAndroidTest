import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_medapps_diabetes_199076774 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(RecyclerView.class);
      LayoutManager var3 = ((RecyclerView)var2).getLayoutManager();
      Object var1 = EasyMock.createMock(View.class);
      var3.getTopDecorationHeight((View)var1);
   }
}
